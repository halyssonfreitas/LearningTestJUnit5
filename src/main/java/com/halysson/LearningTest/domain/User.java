package com.halysson.LearningTest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "AppUser")
public class User {

    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @EqualsAndHashCode.Exclude 
    private String name;
    @EqualsAndHashCode.Exclude 
    private String email;
    @EqualsAndHashCode.Exclude 
    private String password;
    
}
