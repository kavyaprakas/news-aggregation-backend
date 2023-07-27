package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Repository.AdminRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo arep;
	
	public Admin setad(Admin obj) {
		return arep.save(obj);
	}
	
	public List<Admin> getad(){
		List<Admin> ar = new ArrayList<>();
		ar = (List<Admin>) arep.findAll();
		return ar;
	}
	
	public void dels(long id) {
		arep.deleteById(id);;
	}
	
}
