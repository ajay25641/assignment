package demoAssignment.Service;


import demoAssignment.Modal.User;
import demoAssignment.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public int saveUser(User user) {
        return userRepository.saveUser(user);
    }

    public List<User> getUser(){
        return userRepository.getUser();
    }

    public void deleteUser(int id){
        userRepository.deleteUser(id);
    }
}
