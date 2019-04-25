package ac.eoj.core.web.controller;

import ac.eoj.core.object.request.CreateProblemRequest;
import ac.eoj.core.object.response.BaseProblemResponse;
import ac.eoj.core.object.response.ProblemResponse;
import ac.eoj.core.service.ProblemService;
import ac.eoj.core.web.response.PageResourceResponse;
import ac.eoj.core.web.response.ResourceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import static ac.eoj.core.web.security.WebSecurityConfiguration.STAFF_ROLE;

@RestController
public class ProblemController extends AbstractController {
	private final ProblemService problemService;

	@Autowired
	public ProblemController(ProblemService problemService) {
		this.problemService = problemService;
	}

	@GetMapping("/problems")
	@ResponseBody
	public PageResourceResponse<BaseProblemResponse> retrievePage(@RequestParam(defaultValue = "1") int page,
																  @RequestParam(defaultValue = "10") int limit) {
		return new PageResourceResponse<>(problemService.retrievePage(page, limit));
	}

	@GetMapping("/problem")
	@ResponseBody
	public ResourceResponse<ProblemResponse> retrieve(@RequestParam("id") Integer id) {
		return new ResourceResponse<>(problemService.retrieve(id));
	}

	@PostMapping("/problem")
	@ResponseBody
	@RolesAllowed(STAFF_ROLE)
	public ResourceResponse<ProblemResponse> create(@RequestBody @Valid CreateProblemRequest req) {
		return new ResourceResponse<>(problemService.create(req));
	}
}
