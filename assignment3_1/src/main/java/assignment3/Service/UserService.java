package assignment3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment3.Dao.UserDao;
import assignment3.Modal.User;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}

}
