package ac.eoj.core.object;

import ac.eoj.core.data.entity.Case;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class CaseVO {
	private Integer id;
	private String input;
	private String output;

	public CaseVO(Case _case) {
		BeanUtils.copyProperties(_case, this);
	}
}
