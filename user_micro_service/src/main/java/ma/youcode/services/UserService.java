package ma.youcode.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.youcode.dao.UserRepository;
import ma.youcode.models.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll();
        return users;
    }
	public User getUserById(Long id) {
        return userRepository.getOne(id);
    }
 
    public void saveOrUpdate(User user) {
    	userRepository.save(user);
    }
 
    public void delete(Long id) {
    	userRepository.deleteById(id);
    }
	
}
