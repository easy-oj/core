package ac.eoj.core.service;

import ac.eoj.core.data.dao.UserDAO;
import ac.eoj.core.object.entity.User;
import ac.eoj.core.object.response.UserResponse;
import ac.eoj.core.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final UserDAO userDAO;

	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserResponse retrieve(int uid) {
		User user = userDAO.findById(uid);
		Assert.notNull(user);
		return new UserResponse(user);
	}
}
