package ac.eoj.core.data.dao;

import ac.eoj.core.object.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageDAO extends JpaRepository<Language, Integer> {
}
