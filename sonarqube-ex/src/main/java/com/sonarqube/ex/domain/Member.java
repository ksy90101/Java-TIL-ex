package com.sonarqube.ex.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String password;
}
