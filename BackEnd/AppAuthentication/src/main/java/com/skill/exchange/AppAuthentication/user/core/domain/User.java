package com.skill.exchange.AppAuthentication.user.core.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.skill.exchange.AppAuthentication.role.core.domain.Role;

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
