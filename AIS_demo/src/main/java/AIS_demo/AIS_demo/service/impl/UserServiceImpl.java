package AIS_demo.AIS_demo.service.impl;

import org.springframework.stereotype.Service;

import AIS_demo.AIS_demo.model.User;
import AIS_demo.AIS_demo.repository.UserRepository;
import AIS_demo.AIS_demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
