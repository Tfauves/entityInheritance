package com.practice.entity.inheritance.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private ProfileType type;
    private String username;
    private String email;
    private String zipcode;

    public Profile() {
    }

    public Profile(ProfileType type, String username, String email, String zipcode) {
        this.type = type;
        this.username = username;
        this.email = email;
        this.zipcode = zipcode;
    }
}
