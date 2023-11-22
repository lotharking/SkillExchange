package com.skill.exchange.AppAuthentication.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class User {

    @Id
    private String userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    @DBRef
    private List<Role> roles;  
}
