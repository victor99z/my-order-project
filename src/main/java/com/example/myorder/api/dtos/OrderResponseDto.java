package com.example.myorder.api.dtos;

import com.example.myorder.entities.Restaurant;
import com.example.myorder.enums.OrderStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel( value = "Resposta de criação do user")
public class OrderResponseDto {

    @ApiModelProperty(value = "${order.response.id}")
    private Integer id;

    @ApiModelProperty(value = "${order.response.totalValue}")
    private Double totalValue;

    @ApiModelProperty(value = "${order.response.orderStatus}")
    private OrderStatusEnum orderStatus;

    @ApiModelProperty(value = "${order.response.userResponse}")
    private UserResponseDto userResponse;

    @ApiModelProperty(value = "${order.response.itens}")
    private List<OrderItemDto> itens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return totalValue;
    }

    public void setValue(Double value) {
        this.totalValue = value;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public UserResponseDto getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserResponseDto userResponse) {
        this.userResponse = userResponse;
    }

    public List<OrderItemDto> getItens() {
        return itens;
    }

    public void setItens(List<OrderItemDto> itens) {
        this.itens = itens;
    }

}
