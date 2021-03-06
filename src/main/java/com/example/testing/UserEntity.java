package com.example.testing;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String userName;
}
