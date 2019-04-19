package ac.eoj.core.object;

import ac.eoj.core.data.entity.Problem;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class BaseProblemVO {
	private Integer id;
	private String name;
	private Integer submittedCount;
	private Integer acceptedCount;

	public BaseProblemVO(Problem problem) {
		BeanUtils.copyProperties(problem, this);
	}
}
