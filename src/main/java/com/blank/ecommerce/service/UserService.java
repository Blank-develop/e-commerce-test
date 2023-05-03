package com.blank.ecommerce.service;

import com.blank.ecommerce.entity.User;
import com.blank.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
    public void save(User user){
        userRepository.save(user);
    }
}
