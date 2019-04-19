package ac.eoj.core.web.controller;

import ac.eoj.core.object.BaseProblemVO;
import ac.eoj.core.object.ProblemVO;
import ac.eoj.core.service.ProblemService;
import ac.eoj.core.web.response.PageResourceResponse;
import ac.eoj.core.web.response.ResourceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProblemController extends AbstractController {
	private final ProblemService problemService;

	@Autowired
	public ProblemController(ProblemService problemService) {
		this.problemService = problemService;
	}

	@GetMapping("/problems")
	@ResponseBody
	public PageResourceResponse<BaseProblemVO> retrievePage(@RequestParam(defaultValue = "1") int page,
															@RequestParam(defaultValue = "10") int limit) {
		return new PageResourceResponse<>(problemService.retrievePage(page, limit));
	}

	@GetMapping("/problem")
	@ResponseBody
	public ResourceResponse<ProblemVO> retrieve(@RequestParam("id") Integer id) {
		return new ResourceResponse<>(problemService.retrieve(id));
	}
}
