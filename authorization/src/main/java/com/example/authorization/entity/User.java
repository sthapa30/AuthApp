package com.example.authorization.entity;

import com.example.authorization.config.AttributeEncryptor;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "password")
    @Convert(converter = AttributeEncryptor.class)
    private String password;

    @Column(name = "active")
    private boolean active;

    @Column(name = "roles")
    private String roles;

}
