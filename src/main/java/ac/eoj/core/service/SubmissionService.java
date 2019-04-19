package ac.eoj.core.service;

import ac.eoj.core.object.BaseSubmissionVO;
import ac.eoj.core.util.Assert;
import ac.eoj.proto.common.Common;
import ac.eoj.core.data.dao.SubmissionDAO;
import ac.eoj.core.data.entity.Submission;
import ac.eoj.core.object.SubmissionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SubmissionService {
	private static final Sort PAGE_SORT = Sort.by(Sort.Direction.DESC, "id");

	private final SubmissionDAO submissionDAO;

	@Autowired
	public SubmissionService(SubmissionDAO submissionDAO) {
		this.submissionDAO = submissionDAO;
	}

	public SubmissionVO retrieve(int uid, int sid) {
		Submission submission = submissionDAO.findById(sid);
		Assert.notNull(submission);
		Assert.hasAccess(uid == submission.getUid());
		return new SubmissionVO(submission);
	}

	public Page<BaseSubmissionVO> retrievePage(Integer uid, Integer pid, Integer lid, Common.SubmissionStatus status, int page, int limit) {
		Pageable pageable = PageRequest.of(page, limit, PAGE_SORT);

		Specification<Submission> specification = (Specification<Submission>) (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();
			if (uid != null) {
				predicates.add(criteriaBuilder.equal(root.get("uid"), uid));
			}
			if (pid != null) {
				predicates.add(criteriaBuilder.equal(root.get("pid"), pid));
			}
			if (lid != null) {
				predicates.add(criteriaBuilder.equal(root.get("lid"), lid));
			}
			if (status != null) {
				predicates.add(criteriaBuilder.equal(root.get("status"), status));
			}
			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		};
		return submissionDAO.findAll(specification, pageable).map(BaseSubmissionVO::new);
	}
}
