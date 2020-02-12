package com.example.myorder.api.dtos;

public class RestaurantResponse {

    private Integer id;
    private String name;
    private String phone;
    private String email;

    public Integer getId() {
        return id;
    }

    public RestaurantResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public RestaurantResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public RestaurantResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RestaurantResponse setEmail(String email) {
        this.email = email;
        return this;
    }
}
