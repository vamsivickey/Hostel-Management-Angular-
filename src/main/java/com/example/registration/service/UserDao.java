package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.User;
import com.example.registration.repository.UserRepository;

@Service
public class UserDao {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public List<User> getAllUser() {
		
		User ss = new User();

		List<User> s = userRepository.findAll();
		for(int i =0;i<s.size();i++){

			s.get(i).setPassword(this.bCryptPasswordEncoder.decode(s.get(i).getPassword()));

		}

		return s;
	}
	
	public User getUserById(long userId) {
		return userRepository.findById(userId).orElse(null);
	}
		
	public User updateUser(User user) {
		 user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
	
	public void deleteUser(long userId) {
		userRepository.deleteById(userId);
	}
	
}