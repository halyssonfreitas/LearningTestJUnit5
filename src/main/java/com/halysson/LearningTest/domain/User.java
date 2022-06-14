package com.halysson.LearningTest.domain;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

    @EqualsAndHashCode.Include
    private Integer id;
    @EqualsAndHashCode.Exclude 
    private String name;
    @EqualsAndHashCode.Exclude 
    private String email;
    @EqualsAndHashCode.Exclude 
    private String password;
    
}
