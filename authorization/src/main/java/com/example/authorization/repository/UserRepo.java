package com.example.authorization.repository;

import com.example.authorization.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatusCode;

import java.util.Optional;

public interface UserRepo extends JpaRepository <User, Integer>{
    Optional<User> findByUserName(String name);
}
