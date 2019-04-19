package ac.eoj.core.service;

import ac.eoj.core.data.dao.CaseDAO;
import ac.eoj.core.data.dao.ProblemDAO;
import ac.eoj.core.data.entity.Problem;
import ac.eoj.core.object.BaseProblemVO;
import ac.eoj.core.object.CaseVO;
import ac.eoj.core.object.ProblemVO;
import ac.eoj.core.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProblemService {
	private static final Sort PAGE_SORT = Sort.by(Sort.Direction.ASC, "id");

	private final CaseDAO caseDAO;
	private final ProblemDAO problemDAO;

	@Autowired
	public ProblemService(CaseDAO caseDAO, ProblemDAO problemDAO) {
		this.caseDAO = caseDAO;
		this.problemDAO = problemDAO;
	}

	public Page<BaseProblemVO> retrievePage(int page, int limit) {
		Pageable pageable = PageRequest.of(page, limit, PAGE_SORT);
		return problemDAO.findAll(pageable).map(BaseProblemVO::new);
	}

	public ProblemVO retrieve(int id) {
		Problem problem = problemDAO.findById(id);
		Assert.notNull(problem);
		List<CaseVO> exampleCases = caseDAO.findByPidAndExampleTrue(id).stream().map(CaseVO::new).collect(Collectors.toList());
		return new ProblemVO(problem, exampleCases);
	}
}
