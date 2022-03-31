package com.demo.springsecurity.service;

import com.demo.springsecurity.dto.UserDto;
import com.demo.springsecurity.mapper.UserMapper;
import com.demo.springsecurity.model.User;
import com.demo.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    UserMapper userMapper;

    public void createUser(User user) {
        user.getId();
        user.getName();
        user.getEmail();
        user.getPassword();
        user.getAccounts();
        userRepository.save(user);
    }

//    public void addUser(UserDto userDto) {
//        User user = userMapper.map(userDto);
//        userRepository.save(user);
//    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }


}
