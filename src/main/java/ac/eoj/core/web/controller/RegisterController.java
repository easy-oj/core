package ac.eoj.core.web.controller;

import ac.eoj.core.object.request.RegisterRequest;
import ac.eoj.core.object.response.UserResponse;
import ac.eoj.core.service.RegisterService;
import ac.eoj.core.web.response.ResourceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegisterController extends AbstractController {
	private final RegisterService registerService;

	@Autowired
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}

	@PostMapping("/register")
	@ResponseBody
	public ResourceResponse<UserResponse> registry(@RequestBody @Valid RegisterRequest registerRequest) {
		return new ResourceResponse<>(registerService.register(registerRequest));
	}
}
