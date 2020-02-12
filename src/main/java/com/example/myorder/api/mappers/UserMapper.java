package com.example.myorder.api.mappers;

import com.example.myorder.api.dtos.CreateUserDto;
import com.example.myorder.api.dtos.UserResponseDto;
import com.example.myorder.entities.User;
import org.modelmapper.ModelMapper;

public class UserMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static User toEntity(CreateUserDto createUserDto){
        return modelMapper.map(createUserDto, User.class);
    }

    public static UserResponseDto toResponseDto(User user){
        return modelMapper.map(user, UserResponseDto.class);
    }

}
