package com.changepond.FlightManagement.service;

import java.util.List;

import com.changepond.FlightManagement.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String name);



}
