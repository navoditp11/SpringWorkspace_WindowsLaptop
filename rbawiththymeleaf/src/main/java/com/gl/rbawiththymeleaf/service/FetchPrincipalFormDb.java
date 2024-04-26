package com.gl.rbawiththymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.rbawiththymeleaf.entity.User;
import com.gl.rbawiththymeleaf.repository.UserRepository;

@Service
public class FetchPrincipalFormDb implements UserDetailsService{
	
	@Autowired
	UserRepository userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userrepo.findByUsername(username);
		
		if(user==null)
			throw new UsernameNotFoundException("Principal Does not Exist");
		
		return new GlMyUserDecorator(user);
	}

}
