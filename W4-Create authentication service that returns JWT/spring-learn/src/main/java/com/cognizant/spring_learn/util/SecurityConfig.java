package com.cognizant.spring_learn.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
   
        http.csrf().disable() 
            .authorizeRequests()
            .antMatchers("/authenticate").permitAll()  
            .anyRequest().authenticated();           

        return http.build();  
    }
}
