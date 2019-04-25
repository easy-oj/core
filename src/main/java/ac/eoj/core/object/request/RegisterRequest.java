package ac.eoj.core.object.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class RegisterRequest {
	@NotNull
	@Email
	private String email;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{4,16}$")
	private String username;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9@._-]{8,20}$")
	private String password;
}
