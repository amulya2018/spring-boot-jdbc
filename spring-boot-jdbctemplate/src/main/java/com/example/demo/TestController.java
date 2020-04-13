package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	TestService service;
	
	@RequestMapping("/count")
	Integer getContOfUsers() {
		return service.getCountOfUsers();
	}
	@RequestMapping("/user/name/{id}/{address}")
	String getUserName(@PathVariable int id, @PathVariable String address) {
		return service.getUserName(id,address);
	}
	@RequestMapping("/count/updateUser/{id}")
	String updateUser(@RequestBody Accnt accnt,@PathVariable Integer id) {
		return service.updateUser(accnt,(double)id);
	}
	@RequestMapping("/count/{id}")
	String deleteUser(@PathVariable Integer id) {
		return service.deleteUser((double)id);
	}
	@RequestMapping("/count/{id}")
	String getDetails(@PathVariable Integer id) {
		return service.getAccountById((double)id);
	}	
}