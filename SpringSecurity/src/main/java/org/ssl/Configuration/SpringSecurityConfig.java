package org.ssl.Configuration;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SpringSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests( requests -> requests
				.requestMatchers("/ssl/admin").authenticated()
				.requestMatchers("/ssl/welcome").permitAll()
				.anyRequest().authenticated()
		);
		
		http.formLogin(withDefaults());
		http.httpBasic(withDefaults());
	
		
		return http.build();
	}
}
