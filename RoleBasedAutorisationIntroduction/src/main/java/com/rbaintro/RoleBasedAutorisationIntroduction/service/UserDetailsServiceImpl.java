package com.rbaintro.RoleBasedAutorisationIntroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.rbaintro.RoleBasedAutorisationIntroduction.entity.User;
import com.rbaintro.RoleBasedAutorisationIntroduction.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserRepository userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userrepo.getUserByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("Could not Find User");
		}
		return new MyUserDetails(user);
	}
	
	

}
