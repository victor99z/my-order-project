package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateOrderItemDto;
import com.example.myorder.entities.Order;
import com.example.myorder.entities.OrderItem;
import com.example.myorder.repositories.OrdemItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemService {

    @Autowired
    private OrdemItemRepository ordemItemRepository;
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
     FIXME terminar o codigo, faltando funcoes
     */

}
