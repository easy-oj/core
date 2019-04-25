package ac.eoj.core.web.controller;

import ac.eoj.core.object.request.SubmitRequest;
import ac.eoj.core.object.response.SubmissionResponse;
import ac.eoj.core.service.CodeService;
import ac.eoj.core.web.response.ResourceResponse;
import ac.eoj.core.web.security.userdetails.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CodeController extends AbstractController {
	private final CodeService codeService;

	@Autowired
	public CodeController(CodeService codeService) {
		this.codeService = codeService;
	}

	@GetMapping("/code/fetch")
	@ResponseBody
	public ResourceResponse<String> fetch(@AuthenticationPrincipal CustomUserDetails userDetails,
										  @RequestParam("pid") Integer pid,
										  @RequestParam("lid") Integer lid) {
		return new ResourceResponse<>(codeService.fetch(userDetails.getId(), pid, lid));
	}

	@PostMapping("/code/submit")
	@ResponseBody
	public ResourceResponse<SubmissionResponse> submit(@AuthenticationPrincipal CustomUserDetails userDetails,
													   @RequestBody @Valid SubmitRequest submitRequest) {
		return new ResourceResponse<>(codeService.submit(userDetails.getId(), submitRequest));
	}
}
