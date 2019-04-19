package ac.eoj.core.service;

import ac.eoj.core.data.dao.UserDAO;
import ac.eoj.core.data.entity.User;
import ac.eoj.core.object.UserVO;
import ac.eoj.core.util.Assert;
import ac.eoj.core.util.enums.UserRole;
import ac.eoj.core.web.request.RegisterRequest;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
	private final UserDAO userDAO;

	@Autowired
	public RegisterService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserVO register(RegisterRequest registerRequest) {
		User user = userDAO.findByEmail(registerRequest.getEmail());
		Assert.isNull(user);
		user = userDAO.findByUsername(registerRequest.getUsername());
		Assert.isNull(user);
		user = new User();
		BeanUtils.copyProperties(registerRequest, user, "password");
		user.setPassword(DigestUtils.sha256Hex(registerRequest.getPassword()));
		user.setRole(UserRole.STUDENT);
		return new UserVO(userDAO.save(user));
	}
}
