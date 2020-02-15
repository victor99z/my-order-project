package com.example.myorder.api.dtos;

import com.example.myorder.entities.Restaurant;
import com.example.myorder.enums.OrderStatusEnum;
import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel( value = "Objeto que representa um item do usuario")

public class OrderResponseDto {

    private Integer id;

    private Double value;

    private OrderStatusEnum orderStatus;

    private UserResponseDto userResponseDto;

    private List<CreateOrderDto> itens;

    private ProductResponseDto productResponse;



}
