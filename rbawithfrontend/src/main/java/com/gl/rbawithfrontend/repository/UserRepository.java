package com.gl.rbawithfrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.rbawithfrontend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUsername(String s);
	

}