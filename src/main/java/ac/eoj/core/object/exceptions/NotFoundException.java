package ac.eoj.core.object.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ServiceException {
	public NotFoundException() {
		super(HttpStatus.NOT_FOUND);
	}

	public NotFoundException(String message) {
		super(HttpStatus.NOT_FOUND.value(), message);
	}
}
