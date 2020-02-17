package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Objeto que representa um item do pedido")
public class OrderItemDto {
    @ApiModelProperty(value = "${orderItem.response.id}")
    private Integer id;

    @ApiModelProperty(value = "${orderItem.response.quantity}")
    private Integer quantity;

    @ApiModelProperty(value = "${orderItem.response.productResponse}")
    private ProductResponseDto productResponse;

    public Integer getId() {
        return id;
    }

    public OrderItemDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderItemDto setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProductResponseDto getProductResponse() {
        return productResponse;
    }

    public OrderItemDto setProductResponse(ProductResponseDto productResponse) {
        this.productResponse = productResponse;
        return this;
    }
}
