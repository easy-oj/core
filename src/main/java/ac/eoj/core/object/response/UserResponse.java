package ac.eoj.core.object.response;

import ac.eoj.core.object.entity.User;
import ac.eoj.core.object.enums.UserRole;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class UserResponse {
	private Integer id;
	private String email;
	private String username;
	private UserRole role;

	public UserResponse(User user) {
		BeanUtils.copyProperties(user, this);
	}
}
