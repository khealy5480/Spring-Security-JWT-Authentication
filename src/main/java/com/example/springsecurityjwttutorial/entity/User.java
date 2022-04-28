package com.example.springsecurityjwttutorial.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Marks this class as an Entity
@Getter // Defines the getter methods of the member fields
@Setter // Defines the setter methods of the member fields
@ToString // Defines a meaningful toString implementation of this class
@NoArgsConstructor // Defines the default constructor
@AllArgsConstructor
public class User {

    @Id // Marks the "id" field as the identifier of this entity
    @GeneratedValue(strategy = GenerationType.AUTO) // The "id" field is to be generated automatically
    private Long id;
    private String nameId;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String UserType;

}
