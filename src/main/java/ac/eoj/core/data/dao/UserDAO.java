package ac.eoj.core.data.dao;

import ac.eoj.core.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
	User findById(int id);

	User findByEmail(String email);

	User findByUsername(String username);
}
