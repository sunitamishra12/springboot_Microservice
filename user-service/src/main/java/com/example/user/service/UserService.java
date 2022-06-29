package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.VO.Department;
import com.example.user.VO.ResponseTemplate;
import com.example.user.entity.Users;
import com.example.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	public RestTemplate restTemplate;
	
	public Users saveUser(Users user) {
		return userRepository.save(user);
	}

	public ResponseTemplate getUserwithDepartment(Long userId) {
		ResponseTemplate vo = new ResponseTemplate();
		
		Users user = userRepository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ userId, Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
