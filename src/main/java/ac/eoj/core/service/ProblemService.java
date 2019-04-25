package ac.eoj.core.service;

import ac.eoj.core.data.cache.CacheHolder;
import ac.eoj.core.data.dao.CaseDAO;
import ac.eoj.core.data.dao.ProblemDAO;
import ac.eoj.core.object.entity.Case;
import ac.eoj.core.object.entity.Problem;
import ac.eoj.core.object.request.CreateProblemRequest;
import ac.eoj.core.object.response.BaseProblemResponse;
import ac.eoj.core.object.response.CaseResponse;
import ac.eoj.core.object.response.ProblemResponse;
import ac.eoj.core.util.Assert;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProblemService {
	private static final Sort PAGE_SORT = Sort.by(Sort.Direction.ASC, "id");

	private final CacheHolder cacheHolder;
	private final CaseDAO caseDAO;
	private final ProblemDAO problemDAO;

	@Autowired
	public ProblemService(CacheHolder cacheHolder, CaseDAO caseDAO, ProblemDAO problemDAO) {
		this.cacheHolder = cacheHolder;
		this.caseDAO = caseDAO;
		this.problemDAO = problemDAO;
	}

	public Page<BaseProblemResponse> retrievePage(int page, int limit) {
		Pageable pageable = PageRequest.of(page, limit, PAGE_SORT);
		return problemDAO.findAll(pageable).map(BaseProblemResponse::new);
	}

	public ProblemResponse retrieve(int id) {
		Problem problem = problemDAO.findById(id);
		Assert.notNull(problem);
		List<CaseResponse> exampleCases = caseDAO.findByPidAndExampleTrue(id).stream().map(CaseResponse::new).collect(Collectors.toList());
		return new ProblemResponse(problem, exampleCases);
	}

	@Transactional
	public ProblemResponse create(CreateProblemRequest req) {
		Problem problem = problemDAO.findByName(req.getName());
		Assert.isNull(problem);
		Map<Integer, Problem.Limit> specialLimits = new HashMap<>(req.getSpecialLimits().size());
		for (Map.Entry<Integer, CreateProblemRequest.Limit> e : req.getSpecialLimits().entrySet()) {
			Assert.notNull(cacheHolder.getLanguageMap().get(e.getKey()));
			Problem.Limit limit = new Problem.Limit();
			limit.setTimeLimit(e.getValue().getTimeLimit());
			limit.setMemLimit(e.getValue().getMemLimit());
			specialLimits.put(e.getKey(), limit);
		}
		problem = new Problem();
		problem.setName(req.getName());
		problem.setDescription(req.getDescription());
		problem.setSpecialLimits(specialLimits);
		problem = problemDAO.save(problem);
		List<Case> cases = new ArrayList<>(req.getCases().size());
		for (CreateProblemRequest.Case c : req.getCases()) {
			Case _case = new Case();
			_case.setPid(problem.getId());
			BeanUtils.copyProperties(c, _case);
			cases.add(_case);
		}
		cases = caseDAO.saveAll(cases);
		return new ProblemResponse(problem, cases.stream().filter(Case::getExample).map(CaseResponse::new).collect(Collectors.toList()));
	}
}
