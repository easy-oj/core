package ac.eoj.core.web.error;

import ac.eoj.core.util.ToolKit;
import ac.eoj.core.web.response.ErrorResponse;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GlobalErrorController implements ErrorController {
	private static final String ERROR_PATH = "/error";

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}

	@RequestMapping(ERROR_PATH)
	@ResponseBody
	public ErrorResponse error(HttpServletRequest request) {
		return new ErrorResponse(ToolKit.httpStatus(request));
	}
}
