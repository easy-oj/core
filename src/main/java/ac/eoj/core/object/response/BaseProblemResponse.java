package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.Problem;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class BaseProblemResponse {
	private Integer id;
	private String name;
	private Integer submittedCount;
	private Integer acceptedCount;

	public BaseProblemResponse(Problem problem) {
		BeanUtils.copyProperties(problem, this);
	}
}
