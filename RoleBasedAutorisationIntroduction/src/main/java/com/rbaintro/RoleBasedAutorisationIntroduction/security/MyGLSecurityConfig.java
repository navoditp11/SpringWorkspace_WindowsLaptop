package com.rbaintro.RoleBasedAutorisationIntroduction.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.rbaintro.RoleBasedAutorisationIntroduction.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class MyGLSecurityConfig extends WebSecurityConfigurerAdapter {
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("Navodit").password("fsd007").authorities("ADMIN").and().withUser("Jayshree").password("fsd008").authorities("USER");
		
		InMemoryUserDetailsManager glUserDetails = new InMemoryUserDetailsManager();
		UserDetails user1 = User.withUsername("Bharath").password("fsd009").authorities("ADMIN").build();
		
		glUserDetails.createUser(user1);
		
		auth.userDetailsService(glUserDetails);
	}*/
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(glAuthPro());
	}
	
	private AuthenticationProvider glAuthPro() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(glUserDetails());
		daoAuthenticationProvider.setPasswordEncoder(glPasswordEncoder());
		return daoAuthenticationProvider;
	}

	@Bean
	private PasswordEncoder glPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	private UserDetailsService glUserDetails() {
		return new UserDetailsServiceImpl();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
	}

	/*@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}*/

}
