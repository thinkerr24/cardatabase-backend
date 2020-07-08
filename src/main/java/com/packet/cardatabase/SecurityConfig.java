package com.packet.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;*/
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.packet.cardatabase.service.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * super.configure(http); }
	 */

	/*
	 * @Bean
	 * 
	 * @Override public UserDetailsService userDetailsService() { UserDetails user =
	 * User.withDefaultPasswordEncoder() .username("user") .password("password")
	 * .roles("USER") .build(); return new InMemoryUserDetailsManager(user); }
	 */
	@Autowired
	private UserDetailServiceImpl userDetailsService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
}
