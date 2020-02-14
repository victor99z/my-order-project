package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateProductDto {

    @NotEmpty
    @ApiModelProperty(value = "${product.create.name}")
    private String name;

    @NotNull
    @Min(value = 1, message = "Valor minino deve ser 1")
    @ApiModelProperty(value = "${product.create.value}")
    private Double value;

    @NotNull
    @ApiModelProperty(value = "${product.create.restaurantId}")
    private Integer restaurantId;

    public String getName() {
        return name;
    }

    public CreateProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public CreateProductDto setValue(Double value) {
        this.value = value;
        return this;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public CreateProductDto setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
        return this;
    }
}
