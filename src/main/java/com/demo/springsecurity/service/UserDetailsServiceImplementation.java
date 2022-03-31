package com.demo.springsecurity.service;

import com.demo.springsecurity.model.User;
import com.demo.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findByName(username);
        if (!optionalUser.isPresent()) {
            throw new UsernameNotFoundException("User " + username + " does not exist");
        }
        User user = optionalUser.get();

        Set<GrantedAuthority> userRoles = new HashSet<>();
        userRoles.add(new SimpleGrantedAuthority("USER"));
        userRoles.add(new SimpleGrantedAuthority("ADMIN"));

        if (username.equals("user")) {
            userRoles.add(new SimpleGrantedAuthority("USER"));
        }
        if (username.equals("admin")) {
            userRoles.add(new SimpleGrantedAuthority("ADMIN"));
        }

        return new org.springframework.security.core.userdetails
                .User(user.getName(), user.getPassword(), userRoles);
    }
}

