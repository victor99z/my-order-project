package com.example.myorder.entities;

import javax.persistence.*;

@Entity
@Table( name = "USER")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "NAME", nullable = false)
    private String name;

    @Column ( name= "PHONE", nullable=false)
    private String phone;

    @Column( name = "EMAIL", nullable = false)
    private String email;

    @Column( name = "PASSWORD", nullable = false)
    private String password;

    @Column( name = "ADDRESS", nullable = false)
    private String address;

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
