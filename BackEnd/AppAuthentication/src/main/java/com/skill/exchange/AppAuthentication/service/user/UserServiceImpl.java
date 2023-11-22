package com.skill.exchange.AppAuthentication.service.user;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skill.exchange.AppAuthentication.dto.UserDto;
import com.skill.exchange.AppAuthentication.model.User;
import com.skill.exchange.AppAuthentication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User createUser(UserDto userDto) {
        User newUser = new User();
        BeanUtils.copyProperties(userDto, newUser);
        return userRepository.save(newUser);
    }

    @Override
    public User updateUser(String userId, UserDto userDto) {
        User existingUser = userRepository.findById(userId).orElse(null);

        if (existingUser != null){
            BeanUtils.copyProperties(userDto, existingUser);
            return userRepository.save(existingUser);
        }

        return null;
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
    
}
