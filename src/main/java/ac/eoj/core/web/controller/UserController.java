package ac.eoj.core.web.controller;

import ac.eoj.core.object.UserVO;
import ac.eoj.core.service.UserService;
import ac.eoj.core.web.response.ResourceResponse;
import ac.eoj.core.web.security.userdetails.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends AbstractController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/user/current")
	@ResponseBody
	public ResourceResponse<UserVO> current(@AuthenticationPrincipal CustomUserDetails userDetails) {
		return new ResourceResponse<>(userService.retrieve(userDetails.getId()));
	}
}
