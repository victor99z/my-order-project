package com.example.myorder.repositories;

import com.example.myorder.entities.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Integer > {
    @Query("SELECT u FROM Auth u WHERE u.username = :username")
    public Optional<Auth> findByUsername(@Param("username") String username);
}
