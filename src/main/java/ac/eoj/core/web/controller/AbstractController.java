package ac.eoj.core.web.controller;

import ac.eoj.core.object.exceptions.BadRequestException;
import ac.eoj.core.web.WebConfiguration;
import ac.eoj.core.web.editor.DefaultNumberEditor;
import ac.eoj.core.web.editor.PageNumberEditor;
import ac.eoj.core.web.editor.RangeNumberEditor;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(WebConfiguration.API_PREFIX)
public abstract class AbstractController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		switch (binder.getObjectName()) {
			case "page":
				binder.registerCustomEditor(int.class, new PageNumberEditor());
				return;
			case "specialLimits":
				binder.registerCustomEditor(int.class, new RangeNumberEditor(1, 100, 10));
				return;
		}
		binder.registerCustomEditor(int.class, new DefaultNumberEditor(-1));
	}

	protected void checkErrors(Errors errors) {
		MessageSourceResolvable error;
		if (errors.hasGlobalErrors() && (error = errors.getGlobalError()) != null) {
			throw new BadRequestException(error.getDefaultMessage());
		}
		if (errors.hasFieldErrors() && (error = errors.getFieldError()) != null) {
			throw new BadRequestException(error.getDefaultMessage());
		}
	}
}
