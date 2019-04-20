package ac.eoj.core.service;

import ac.eoj.core.data.dao.UserDAO;
import ac.eoj.core.data.entity.User;
import ac.eoj.core.object.UserVO;
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

	public UserVO retrieve(int uid) {
		User user = userDAO.findById(uid);
		Assert.notNull(user);
		return new UserVO(user);
	}
}
