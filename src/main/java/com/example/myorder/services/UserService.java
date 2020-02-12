package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateUserDto;
import com.example.myorder.api.dtos.UserResponseDto;
import com.example.myorder.api.mappers.UserMapper;
import com.example.myorder.entities.User;
import com.example.myorder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserResponseDto create(CreateUserDto createUserDto){
        //validateUserEmail(createUserDto.getEmail());
        //saveUser(UserMapper.toEntity(CreateUserDto));
        return null;
    }

    public void validateUserEmail(String email){

    }

    private User saveUser(User user){
        return userRepository.save(user);
    }


}
