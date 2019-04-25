package ac.eoj.core.data.cache;

import ac.eoj.core.data.dao.LanguageDAO;
import ac.eoj.core.object.entity.Language;
import ac.eoj.core.util.async.TaskInvoker;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CacheHolder {
	private final LanguageDAO languageDAO;
	private final TaskInvoker taskInvoker;

	@Getter
	private List<Language> languageList;
	@Getter
	private Map<Integer, Language> languageMap;

	@Autowired
	public CacheHolder(LanguageDAO languageDAO, TaskInvoker taskInvoker) {
		this.languageDAO = languageDAO;
		this.taskInvoker = taskInvoker;
		this.retrieveCache();
	}

	private void retrieveCache() {
		retrieveLanguage();
	}

	@Scheduled(cron = "0 * * * * *")
	public void retrieveLanguage() {
		taskInvoker.invoke(() -> {
			List<Language> languages = languageDAO.findAll();
			languages.sort(Comparator.comparing(Language::getName));
			this.languageList = languages;
			this.languageMap = languages.stream().collect(Collectors.toMap(Language::getId, o -> o));
		});
	}
}
