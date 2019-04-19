package ac.eoj.core.object;

import ac.eoj.core.data.entity.User;
import ac.eoj.core.util.enums.UserRole;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class UserVO {
	private Integer id;
	private String email;
	private String username;
	private UserRole role;

	public UserVO(User user) {
		BeanUtils.copyProperties(user, this);
	}
}
