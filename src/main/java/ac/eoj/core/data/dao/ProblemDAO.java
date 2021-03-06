package ac.eoj.core.data.dao;

import ac.eoj.core.object.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemDAO extends JpaRepository<Problem, Integer> {
	Problem findById(int id);

	Problem findByName(String name);
}
