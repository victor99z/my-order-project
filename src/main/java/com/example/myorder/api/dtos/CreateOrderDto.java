package com.example.myorder.api.dtos;


import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CreateOrderDto {

    @NotNull
    @ApiModelProperty(value = "${order.create.userId}")
    private Integer userId;

    @NotNull
    @ApiModelProperty(value = "${order.create.restaurantId}")
    private Integer restaurantId;

    @NotEmpty
    @ApiModelProperty(value = "${order.create.orderItens}")
    private List<CreateOrderItemDto> orderItens;

    public Integer getUserId() {
        return userId;
    }

    public CreateOrderDto setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public CreateOrderDto setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
        return this;
    }

    public List<CreateOrderItemDto> getOrderItens() {
        return orderItens;
    }

    public CreateOrderDto setOrderItens(List<CreateOrderItemDto> orderItem) {
        this.orderItens = orderItem;
        return this;
    }
}
