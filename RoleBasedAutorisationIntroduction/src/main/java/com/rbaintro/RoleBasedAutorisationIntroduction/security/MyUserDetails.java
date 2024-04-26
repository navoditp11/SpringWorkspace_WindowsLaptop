package com.rbaintro.RoleBasedAutorisationIntroduction.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.rbaintro.RoleBasedAutorisationIntroduction.entity.Role;

public class MyUserDetails implements UserDetails{
	
	
	public User user;
	
	
	public MyUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Role> roles = (List<Role>) user.getRoles();
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
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
