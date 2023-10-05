package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {

	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(auth -> {
			auth.requestMatchers("/api/employees").permitAll().anyRequest().authenticated();
		}).csrf(cors -> cors.disable()).formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());

		/**
		 * disabling csrf protection is not recommended in real time application but for
		 * testing purpose u can disable it.
		 * 
		 * inside forLogin method u use you own login Forms otherwise it will be default
		 * 
		 * httpBasic make sure the form shows up so that u can login to view the data.
		 * otherwise u will only get the message of Unauthorized.
		 */

		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetails(PasswordEncoder passwordEncoder) {

		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();

		UserDetails admin = User.withUsername("admin").password(passwordEncoder.encode("12345")).authorities("read")
				.build();
		UserDetails user = User.withUsername("user").password(passwordEncoder.encode("12345")).authorities("read")
				.build();
		userDetailsService.createUser(admin);
		userDetailsService.createUser(user);

		return userDetailsService;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
