package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;

public class UserResponseDto {
    @NotEmpty
    @ApiModelProperty(value = "${user.create.id}")
    private Integer id;
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
    @ApiModelProperty(value = "${user.create.address}")
    private String address;

    public Integer getId() {
        return id;
    }

    public UserResponseDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserResponseDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResponseDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserResponseDto setAddress(String address) {
        this.address = address;
        return this;
    }
}
