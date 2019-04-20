package ac.eoj.core.web.controller;

import ac.eoj.core.object.CaseVO;
import ac.eoj.core.service.CaseService;
import ac.eoj.core.web.response.ResourceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaseController extends AbstractController {
	private final CaseService caseService;

	@Autowired
	public CaseController(CaseService caseService) {
		this.caseService = caseService;
	}

	@GetMapping("/case/example")
	@ResponseBody
	public ResourceResponse<List<CaseVO>> retrieveExampleByPid(@RequestParam("pid") Integer pid) {
		return new ResourceResponse<>(caseService.retrieveExampleByPid(pid));
	}
}
