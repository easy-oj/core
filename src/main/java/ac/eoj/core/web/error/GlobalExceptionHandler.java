package ac.eoj.core.web.error;

import ac.eoj.core.util.exceptions.ServiceException;
import ac.eoj.core.web.response.ErrorResponse;
import ac.eoj.core.web.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice("com.moekr.eoj.core.web.controller.api")
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Response handleException(HttpServletResponse response, Exception exception) {
		exception.printStackTrace();
		return handle(response, HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage());
	}

	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public Response handleServiceException(HttpServletResponse response, ServiceException exception) {
		exception.printStackTrace();
		return handle(response, HttpStatus.valueOf(exception.getCode()), exception.getMessage());
	}

	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseBody
	public Response handleMissingServletRequestParameterException(HttpServletResponse response, MissingServletRequestParameterException exception) {
		return handle(response, HttpStatus.BAD_REQUEST, exception.getParameterName() + " is required");
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	@ResponseBody
	public Response handleMethodArgumentTypeMismatchException(HttpServletResponse response, MethodArgumentTypeMismatchException exception) {
		String message = exception.getName() + " has wrong type";
		Class requiredType = exception.getRequiredType();
		if (requiredType != null) {
			message = exception.getName() + " should be type " + requiredType.getSimpleName();
		}
		return handle(response, HttpStatus.BAD_REQUEST, message);
	}

	private Response handle(HttpServletResponse response, HttpStatus status, String message) {
		response.setStatus(status.value());
		return new ErrorResponse(status.value(), message);
	}
}
