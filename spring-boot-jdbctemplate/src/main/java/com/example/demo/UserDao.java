package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate template;
	
	Integer getCountOfUsers() {
		return template.queryForObject("select count(*)from user",Integer.class);
	}
	String getUserName(int id, String address) {
		return template.queryForObject
	("select name from user where id=? and address=?", new Object[] {id,address},
			String.class);
	}
	String deleteUser(double id) {
		String sql="delete from user where id = ?";
		if(template.update(sql,id)==1) {
			return "deleted user";
		}else {
			return "not deleted";
		}
	}

	public String updateUser(Accnt account, double id) {
		String sql = "update acc set balance = ? where id = ?";
		
		if(template.update(sql, account.getBalance(), id)==1)
		{
			return "updated successfully";
		}else{
			return "something terrible happened";
		}
	}
	public String addAccount(Accnt account) {
		String sql = "INSERT INTO accnt values(?,?,?,?)" ;
		if(template.update(sql, account.id, account.name, account.balance, account.pin)==1)
		{
			return "created account successfully";
			
		}else {
			return "something terrible occured";
		}}
	public Accnt getAccountById(double id) {
			Accnt account = new Accnt();
			
			try {
				String sql = "select * from accnt where id = ?";
				return jdbcTemplate.queryForObject(sql, new Object[] {id}, new RowMapper<Account>(){
		return null;
	}
			}
	}
