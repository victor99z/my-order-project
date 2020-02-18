package com.example.myorder.api.mappers;

import com.example.myorder.api.dtos.RestaurantResponseDto;
import com.example.myorder.entities.Restaurant;
import org.modelmapper.ModelMapper;

public class RestaurantMapper {
    public static final ModelMapper modelMapper = new ModelMapper();

    public static RestaurantResponseDto toResponseDto(Restaurant restaurant){
        return modelMapper.map(restaurant, RestaurantResponseDto.class);
    }

}
