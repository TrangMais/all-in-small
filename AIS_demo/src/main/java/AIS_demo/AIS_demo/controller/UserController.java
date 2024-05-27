package AIS_demo.AIS_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AIS_demo.AIS_demo.model.User;
import AIS_demo.AIS_demo.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//build create user REST API
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
	}

}
