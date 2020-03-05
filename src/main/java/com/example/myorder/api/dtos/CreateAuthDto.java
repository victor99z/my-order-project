package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;

public class CreateAuthDto {


    @NotNull
    @ApiModelProperty(value = "${auth.create.username}")
    private String username;

    @NotNull
    @ApiModelProperty(value = "${auth.create.password}")
    private String password;


    public String getUsername() {
        return username;
    }

    public CreateAuthDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CreateAuthDto setPassword(String password) {
        this.password = password;
        return this;
    }
}
