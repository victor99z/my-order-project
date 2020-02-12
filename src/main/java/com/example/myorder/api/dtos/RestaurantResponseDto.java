package com.example.myorder.api.dtos;

public class RestaurantResponseDto {

    private Integer id;
    private String name;
    private String phone;
    private String email;

    public Integer getId() {
        return id;
    }

    public RestaurantResponseDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public RestaurantResponseDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RestaurantResponseDto setEmail(String email) {
        this.email = email;
        return this;
    }
}
