package com.example.myorder.api.mappers;

import com.example.myorder.api.dtos.AuthResponseDto;
import com.example.myorder.entities.Auth;
import org.modelmapper.ModelMapper;

public class AuthMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static AuthResponseDto toResponseDto(Auth auth){
        return modelMapper.map(auth, AuthResponseDto.class);
    }
}
