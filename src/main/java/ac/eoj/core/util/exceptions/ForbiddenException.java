package ac.eoj.core.util.exceptions;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends ServiceException {
	public ForbiddenException() {
		super(HttpStatus.FORBIDDEN);
	}
}
