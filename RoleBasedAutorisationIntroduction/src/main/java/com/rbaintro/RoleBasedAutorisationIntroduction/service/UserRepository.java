package com.rbaintro.RoleBasedAutorisationIntroduction.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rbaintro.RoleBasedAutorisationIntroduction.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("select * from User u where u.username=?1")
	public User getUserByUsername(String username);

}
