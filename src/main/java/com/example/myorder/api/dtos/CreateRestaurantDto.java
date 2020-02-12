package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;

public class CreateRestaurantDto {


    @NotEmpty
    @ApiModelProperty( value = "Nome")
    private String name;

    @ApiModelProperty( value = "Telefone")
    private String phone;

    @ApiModelProperty( value = "Email")
    private String email;

    public String getName() {
        return name;
    }

    public CreateRestaurantDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CreateRestaurantDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateRestaurantDto setEmail(String email) {
        this.email = email;
        return this;
    }
}
