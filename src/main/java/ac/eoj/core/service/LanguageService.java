package ac.eoj.core.service;

import ac.eoj.core.data.cache.CacheHolder;
import ac.eoj.core.object.response.LanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageService {
	private final CacheHolder cacheHolder;

	@Autowired
	public LanguageService(CacheHolder cacheHolder) {
		this.cacheHolder = cacheHolder;
	}

	public List<LanguageResponse> retrieveAll() {
		return cacheHolder.getLanguageList().stream().map(LanguageResponse::new).collect(Collectors.toList());
	}
}
