package com.skill.exchange.AppAuthentication.service.user;

import java.util.List;

import com.skill.exchange.AppAuthentication.dto.UserDto;
import com.skill.exchange.AppAuthentication.model.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(String userId);
    User createUser(UserDto userDto);
    User updateUser(String userId, UserDto userDto);
    void deleteUser(String userId);    
}
