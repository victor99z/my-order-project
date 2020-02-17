package com.example.myorder.api.mappers;

import com.example.myorder.api.dtos.OrderResponseDto;
import com.example.myorder.entities.Order;
import org.modelmapper.ModelMapper;

public class OrderMapper  {
    ModelMapper modelMapper = new ModelMapper();

    public OrderResponseDto toResponseDto(Order order){
        return modelMapper.map(order,OrderResponseDto.class);
    }



}
