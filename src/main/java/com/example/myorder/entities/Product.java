package com.example.myorder.entities;


import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "NAME", nullable = false)
    private String name;

    @Column( name = "VALUE", nullable = false)
    private Double value;


    // EAGER = vem com os dados do restaurante
    @ManyToOne()
    @JoinColumn(name="RESTAURANT_ID", nullable = false)
    private Restaurant restaurant;

    public Integer getId() {
        return id;
    }

    public Product setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public Product setValue(Double value) {
        this.value = value;
        return this;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Product setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }
}
