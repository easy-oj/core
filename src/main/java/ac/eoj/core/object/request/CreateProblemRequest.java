package ac.eoj.core.object.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
public class CreateProblemRequest {
	@NotNull
	@NotEmpty
	private String name;
	@NotNull
	@NotEmpty
	private String description;
	@NotNull
	private Map<Integer, Limit> specialLimits;
	@NotNull
	@NotEmpty
	private List<Case> cases;

	@Data
	public static class Limit {
		private Integer timeLimit;
		private Integer memLimit;
	}

	@Data
	public static class Case {
		private Boolean example;
		private String input;
		private String output;
	}
}
