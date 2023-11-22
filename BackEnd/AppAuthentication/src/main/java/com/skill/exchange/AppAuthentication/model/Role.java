package com.skill.exchange.AppAuthentication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "roles")
public class Role {
    @Id
    private String roleId;
    private String roleName;
}
