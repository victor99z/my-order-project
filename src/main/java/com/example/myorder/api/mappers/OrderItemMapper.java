package com.example.myorder.api.mappers;

import com.example.myorder.api.dtos.OrderItemDto;
import com.example.myorder.entities.OrderItem;
import org.modelmapper.ModelMapper;

public class OrderItemMapper {
    public static final ModelMapper modelMapper = new ModelMapper();

    public static OrderItemDto toOrderItemDto(OrderItem orderItem){
        return modelMapper.map(orderItem, OrderItemDto.class);
    }

}
