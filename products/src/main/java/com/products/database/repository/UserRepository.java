package com.products.database.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.entitys.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional <User> findByUsername(String userName);

	

}
