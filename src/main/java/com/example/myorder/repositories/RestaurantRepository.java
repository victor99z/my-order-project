package com.example.myorder.repositories;

import com.example.myorder.entities.Restaurant;
import com.example.myorder.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
    @Query("SELECT u FROM Restaurant u " + "WHERE u.email = :Email")
    public Restaurant findByEmail(@Param("Email") String email);

}
