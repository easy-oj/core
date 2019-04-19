package ac.eoj.core.web.controller;

import ac.eoj.core.object.LanguageVO;
import ac.eoj.core.service.LanguageService;
import ac.eoj.core.web.response.ResourceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController extends AbstractController {
	private final LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/languages")
	@ResponseBody
	public ResourceResponse<List<LanguageVO>> retrieveAll() {
		return new ResourceResponse<>(languageService.retrieveAll());
	}
}
