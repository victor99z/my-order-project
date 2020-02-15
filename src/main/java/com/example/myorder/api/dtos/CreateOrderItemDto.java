package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CreateOrderItemDto {

    @ApiModelProperty( value = "${orderItem.create.product}")
    @NotNull
    private Integer productId;

    @Min(value = 1)
    @NotNull
    @ApiModelProperty( value = "${orderItem.create.quantity}")
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public CreateOrderItemDto setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public CreateOrderItemDto setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
}
