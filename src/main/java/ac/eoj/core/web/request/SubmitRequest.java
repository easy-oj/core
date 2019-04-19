package ac.eoj.core.web.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SubmitRequest {
	@NotNull
	private Integer pid;
	@NotNull
	private Integer lid;
	@NotNull
	private String content;
}
