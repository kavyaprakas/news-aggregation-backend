package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Admin;
import com.example.demo.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService aserv;
	
	@PostMapping("/set")
	public Admin addadmin(@RequestBody Admin obj) {
		return aserv.setad(obj);
	}
	
	@GetMapping("/get")
	public List<Admin> showadmin(){
		return aserv.getad();
	}
	
	@DeleteMapping("/del/{id}")
	public String deleteadmin(@PathVariable ("id") long id,@RequestBody Admin obj) {
		aserv.dels(id);
		return "Successfully Deleted";
	}
}
