package com.changepond.FlightManagement.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.changepond.FlightManagement.UserRepository;
import com.changepond.FlightManagement.model.User;
import com.changepond.FlightManagement.util.PasswordUtil;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	
	@Autowired UserRepository userRepository;

	@Override
	public User save(User user) {
		
		String password= PasswordUtil.getPasswordHash(user.getPassword());
		user.setPassword(password);
		user.setCreatedDate(new Date());
		return userRepository.save(user);

	}

	@Override
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
	return userRepository.findByEmailIgnoreCase(email);
	}

}
