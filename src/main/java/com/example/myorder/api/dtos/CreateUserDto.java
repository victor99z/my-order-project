package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;

public class CreateUserDto {

    @NotEmpty
    @ApiModelProperty(value = "${user.create.name}")
    private String name;
    @NotEmpty
    @ApiModelProperty(value = "${user.create.phone}")
    private String phone;
    @NotEmpty
    @ApiModelProperty(value = "${user.create.email}")
    private String email;
    @NotEmpty
    @ApiModelProperty(value = "${user.create.password}")
    private String password;
    @NotEmpty
    @ApiModelProperty(value = "${user.create.address}")
    private String address;

    public String getName() {
        return name;
    }

    public CreateUserDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CreateUserDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateUserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CreateUserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CreateUserDto setAddress(String address) {
        this.address = address;
        return this;
    }
}
