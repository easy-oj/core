package ac.eoj.core.web.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = true)
public class ErrorResponse extends EmptyResponse {
	private String message;

	public ErrorResponse(HttpStatus status) {
		super(status.value());
		this.message = status.getReasonPhrase();
	}

	public ErrorResponse(int code, String message) {
		super(code);
		this.message = message;
	}
}
