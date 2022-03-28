package com.demo.springsecurity.mapper;

import com.demo.springsecurity.dto.UserDto;
import com.demo.springsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public User map(UserDto userDto) {
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        String encryptedPassword = bCryptPasswordEncoder.encode(userDto.getPassword());
        user.setPassword(encryptedPassword);
        return user;
    }

    public UserDto map(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        return userDto;
    }
}
