
package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;



@Service
public class UserService {

	@Autowired
	private UserRepo urep;
	
	public User setadd(User obj) {
		return urep.save(obj);
	}
	
	public List<User> getadd(){
		List<User> ar = new ArrayList<>();
		ar = (List<User>) urep.findAll();
		return ar;
	}
	
	public void deles(long id) {
		urep.deleteById(id);;
	}
	
}
