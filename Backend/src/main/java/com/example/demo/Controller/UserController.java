package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userv;
	
	@PostMapping("/post")
	public User adduser(@RequestBody User obj) {
		return userv.setadd(obj);
	}
	
	@GetMapping("/getting")
	public List<User> showuser(){
		return userv.getadd();
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteadmin(@PathVariable ("id") long id,@RequestBody User obj) {
		userv.deles(id);
		return "Successfully Deleted";
	}
}

