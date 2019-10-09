package com.changepond.FlightManagement;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.changepond.FlightManagement.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>
{

	User findByEmailIgnoreCase(String username);
	}

