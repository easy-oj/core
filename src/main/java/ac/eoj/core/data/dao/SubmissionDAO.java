package ac.eoj.core.data.dao;

import ac.eoj.core.object.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionDAO extends JpaRepository<Submission, Integer>, JpaSpecificationExecutor<Submission> {
	Submission findById(int id);
}
