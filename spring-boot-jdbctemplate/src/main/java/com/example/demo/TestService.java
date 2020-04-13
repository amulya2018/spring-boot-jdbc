package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	UserDao dao;
	
	Integer getCountOfUsers() {
		return dao.getCountOfUsers();
	}
		String getUserName(int id, String address) {
			return dao.getUserName(id, address);
		}
		public String deleteUser(double id) {	
			return dao.deleteUser(id);
		}
		public String updateUser(Accnt accnt, double id) {
			return dao.updateUser(accnt, id);
		}
		public String getAccountById(double id) {
			return dao.getAccountById(id);
		}
	}
	

