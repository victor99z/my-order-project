package com.example.myorder.entities;

import javax.persistence.*;

@Entity
@Table( name = "AUTH" )
public class Auth {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "USERNAME", nullable = false)
    private String username;

    @Column( name = "PASSWORD", nullable = false)
    private String password;

    public Integer getId() {
        return id;
    }

    public Auth setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Auth setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Auth setPassword(String password) {
        this.password = password;
        return this;
    }
}
