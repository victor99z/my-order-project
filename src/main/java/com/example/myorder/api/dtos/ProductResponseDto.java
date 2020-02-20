package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProductResponseDto {
    @NotEmpty
    @ApiModelProperty(value = "${product.response.name}")
    private String name;

    @NotNull
    @Min(value = 1, message = "Valor minino deve ser 1")
    @ApiModelProperty(value = "${product.response.value}")
    private Double value;

    @NotNull
    @ApiModelProperty(value = "${product.response.restaurant}")
    private RestaurantResponseDto restaurant;

    public String getName() {
        return name;
    }

    public ProductResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public ProductResponseDto setValue(Double value) {
        this.value = value;
        return this;
    }


    public RestaurantResponseDto getRestaurant() {
        return restaurant;
    }

    public ProductResponseDto setRestaurant(RestaurantResponseDto restaurant) {
        this.restaurant = restaurant;
        return this;
    }
}
