package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@ApiModel()
public class AuthResponseDto {

    @NotNull
    @ApiModelProperty(value = "${auth.response.userId}")
    private Integer id;

    @ApiModelProperty(value = "${auth.response.username}")
    private String username;
    @ApiModelProperty(value = "${auth.response.password}")
    private String password;

    public String getUsername() {
        return username;
    }

    public AuthResponseDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AuthResponseDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AuthResponseDto setId(Integer id) {
        this.id = id;
        return this;
    }
}
