package ac.eoj.core.object.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends ServiceException {
	public BadRequestException() {
		super(HttpStatus.BAD_REQUEST);
	}

	public BadRequestException(String message) {
		super(HttpStatus.BAD_REQUEST.value(), message);
	}
}
