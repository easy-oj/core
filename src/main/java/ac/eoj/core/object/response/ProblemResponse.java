package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.Problem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProblemResponse extends BaseProblemResponse {
	private String description;
	private Map<Integer, Limit> specialLimits;
	private List<CaseResponse> exampleCases;

	public ProblemResponse(Problem problem, List<CaseResponse> exampleCases) {
		BeanUtils.copyProperties(problem, this);
		this.specialLimits = problem.getSpecialLimits().entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> new Limit(e.getValue())));
		this.exampleCases = exampleCases;
	}

	@Data
	public static class Limit {
		private Integer timeLimit;
		private Integer memLimit;

		public Limit(Problem.Limit limit) {
			BeanUtils.copyProperties(limit, this);
		}
	}
}
