package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateOrderItemDto;
import com.example.myorder.api.dtos.OrderItemDto;
import com.example.myorder.api.mappers.ProductMapper;
import com.example.myorder.entities.Order;
import com.example.myorder.entities.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemService {

    @Autowired
    private ProductService productService;

    public List<OrderItem> createOrderItens(List<CreateOrderItemDto> itens, Order order){

        return itens.stream()
                .map(orderItemDto -> buildOrderItem(orderItemDto, order))
                .collect(Collectors.toList());
    }

    private OrderItem buildOrderItem(CreateOrderItemDto createOrderItemDto, Order order){
        return new OrderItem()
                .setProduct(productService.findById(createOrderItemDto.getProductId()))
                .setOrder(order)
                .setQuantity(createOrderItemDto.getQuantity());
    }
    /*
        CODIGO FEITO NO CURSO

    public List<OrderItemDto> buildOrderItemDtos(List<OrderItem> orderItems){
        return orderItems.stream().map(orderItem -> new OrderItemDto()
                .setId(orderItem.getId())
                .setQuantity(orderItem.getQuantity())
                .setProductResponse(productService.createProductResponseDto(orderItem.getProduct(), orderItem.getOrder().getRestaurant())))
                .collect(Collectors.toList());
    }

    */
    public OrderItemDto buildOrderItemDto(OrderItem orderItem){
        return new OrderItemDto()
                .setId(orderItem.getId())
                .setQuantity(orderItem.getQuantity())
                .setProductResponse(ProductMapper.toResponseDto(orderItem.getProduct()));
    }

    public List<OrderItemDto> listItemDto(List<OrderItem> orderItems){
        return orderItems.stream().map(this::buildOrderItemDto).collect(Collectors.toList());
    }


}
