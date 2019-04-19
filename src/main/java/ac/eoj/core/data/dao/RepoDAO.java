package ac.eoj.core.data.dao;

import ac.eoj.core.data.entity.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoDAO extends JpaRepository<Repo, Integer> {
	Repo findByUidAndPidAndLid(int uid, int pid, int lid);
}
