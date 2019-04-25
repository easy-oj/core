package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.Case;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class CaseResponse {
	private Integer id;
	private String input;
	private String output;

	public CaseResponse(Case _case) {
		BeanUtils.copyProperties(_case, this);
	}
}
