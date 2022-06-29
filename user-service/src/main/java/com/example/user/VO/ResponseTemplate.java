package com.example.user.VO;

import com.example.user.entity.Users;

public class ResponseTemplate {
	
	private Users user;
	private Department department;
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
