package ac.eoj.core.object;

import ac.eoj.core.data.entity.Language;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class LanguageVO {
	private Integer id;
	private String name;
	private String highlight;
	private String version;
	private String templateContent;
	private String compileCmd;
	private Integer timeLimit;
	private Integer memLimit;

	public LanguageVO(Language language) {
		BeanUtils.copyProperties(language, this);
	}
}
