package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.Language;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class LanguageResponse {
	private Integer id;
	private String name;
	private String highlight;
	private String version;
	private String templateContent;
	private String compileCmd;
	private Integer timeLimit;
	private Integer memLimit;

	public LanguageResponse(Language language) {
		BeanUtils.copyProperties(language, this);
	}
}
