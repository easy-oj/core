package ac.eoj.core.data.dao;

import ac.eoj.core.data.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseDAO extends JpaRepository<Case, Integer> {
	List<Case> findByPidAndExampleTrue(int pid);
}
