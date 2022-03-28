package com.demo.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    UserDetailsService userDetailsService() {
        var userDetailsManager = new InMemoryUserDetailsManager();

        UserDetails admin = User.withUsername("admin")
                .password("admin")
                .authorities("edit")
                .build();
        return userDetailsManager;
    }

//    @Bean
//    UserDetailsService adminDetailsService() {
//        var userDetailsManager = new InMemoryUserDetailsManager();
//
//        UserDetails user = User.withUsername("user")
//                .password("abc")
//                .authorities("view")
//                .build();
//
//        return userDetailsManager;
//    }
}
