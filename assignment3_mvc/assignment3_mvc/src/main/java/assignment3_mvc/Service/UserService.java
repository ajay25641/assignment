package assignment3_mvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment3_mvc.Modal.User;
import assignment3_mvc.Repository.UserRepository;




@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public int saveUser(User user) {
		return userRepository.saveUser(user);
	}

}
