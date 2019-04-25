package ac.eoj.core.object.exceptions;

import org.springframework.http.HttpStatus;

public class ConflictException extends ServiceException {
	public ConflictException() {
		super(HttpStatus.CONFLICT);
	}

	public ConflictException(String message) {
		super(HttpStatus.CONFLICT.value(), message);
	}
}
