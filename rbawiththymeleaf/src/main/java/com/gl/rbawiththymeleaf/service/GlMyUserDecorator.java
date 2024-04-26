package com.gl.rbawiththymeleaf.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.gl.rbawiththymeleaf.entity.Role;
import com.gl.rbawiththymeleaf.entity.User;

public class GlMyUserDecorator implements UserDetails {

	User user;

	public GlMyUserDecorator(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roles = user.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		return authorities;

	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		LocalDate accexpirydate = user.getAccountExpiryDate();
		LocalDate todaysdate =  LocalDate.now();
		if(accexpirydate.isAfter(todaysdate))
		    return true;
		else
			return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		if(user.getAccountLockedStatus() == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		LocalDate credexpirydate = user.getCredentialsExpiryDate();
		LocalDate todaysdate =  LocalDate.now();
		if(credexpirydate.isAfter(todaysdate))
		    return true;
		else
			return false;
	}

	@Override
	public boolean isEnabled() {
		if(user.getEnabledStatus() == 1)
			return true;
		else
			return false;
	}

}
