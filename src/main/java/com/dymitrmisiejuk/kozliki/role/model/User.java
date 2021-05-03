package com.dymitrmisiejuk.kozliki.role.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="APP_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String role;
}
