package ac.eoj.core.object.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends RuntimeException {
	private int code;

	public ServiceException(HttpStatus status) {
		super(status.getReasonPhrase());
		this.code = status.value();
	}

	public ServiceException(int code, String message) {
		super(message);
		this.code = code;
	}
}
