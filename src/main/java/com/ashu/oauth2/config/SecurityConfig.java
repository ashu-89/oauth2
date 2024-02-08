package com.ashu.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

//Either of @EnableWebSecurity or @Configuration works
//@EnableWebSecurity -> Bard after lot of prodding and feedback
//@Configuration -> youtube - techie -> called Programming Techie
//https://youtu.be/_0oXZKr97ro?si=CL0okaD9I6-27HBT

@EnableWebSecurity
//@Configuration
public class SecurityConfig {

    //both work
    //first one's from Bard after lot of prodding and feedback
    //Second one's from a youtube channel of a techie - called Programming Techie
    //https://youtu.be/_0oXZKr97ro?si=CL0okaD9I6-27HBT

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests((authorizeRequests) -> authorizeRequests.anyRequest().authenticated())
                .cors(Customizer.withDefaults())
                .csrf(Customizer.withDefaults())
                .sessionManagement(Customizer.withDefaults())
                .oauth2ResourceServer((oauth2ResourceServer) -> oauth2ResourceServer.jwt(Customizer.withDefaults()))
                .build();
    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.cors(Customizer.withDefaults())
//                .csrf(CsrfConfigurer::disable)
//                .authorizeHttpRequests(httpRequests -> httpRequests.anyRequest().authenticated())
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .oauth2ResourceServer(oauth2ResourceServer -> oauth2ResourceServer.jwt(Customizer.withDefaults()))
//                .build();
//    }


}