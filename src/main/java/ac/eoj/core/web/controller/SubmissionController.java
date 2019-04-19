package ac.eoj.core.web.controller;

import ac.eoj.core.object.BaseSubmissionVO;
import ac.eoj.core.object.SubmissionVO;
import ac.eoj.core.service.SubmissionService;
import ac.eoj.core.web.response.PageResourceResponse;
import ac.eoj.core.web.response.ResourceResponse;
import ac.eoj.core.web.security.userdetails.CustomUserDetails;
import ac.eoj.proto.common.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubmissionController extends AbstractController {
	private final SubmissionService submissionService;

	@Autowired
	public SubmissionController(SubmissionService submissionService) {
		this.submissionService = submissionService;
	}

	@GetMapping("/submission")
	@ResponseBody
	public ResourceResponse<SubmissionVO> retrieve(@AuthenticationPrincipal CustomUserDetails userDetails,
												   @RequestParam("id") Integer sid) {
		return new ResourceResponse<>(submissionService.retrieve(userDetails.getId(), sid));
	}

	@GetMapping("/submissions")
	@ResponseBody
	public PageResourceResponse<BaseSubmissionVO> retrievePage(@RequestParam(value = "uid", required = false) Integer uid,
															   @RequestParam(value = "pid", required = false) Integer pid,
															   @RequestParam(value = "lid", required = false) Integer lid,
															   @RequestParam(value = "status", required = false) Common.SubmissionStatus status,
															   @RequestParam(defaultValue = "1") int page,
															   @RequestParam(defaultValue = "10") int limit) {
		return new PageResourceResponse<>(submissionService.retrievePage(uid, pid, lid, status, page, limit));
	}
}
