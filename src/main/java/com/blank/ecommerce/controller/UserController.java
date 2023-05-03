package com.blank.ecommerce.controller;

import com.blank.ecommerce.entity.User;
import com.blank.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
   @Autowired
    private UserService userService;

   @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){
       User existingUser = userService.findByEmail(user.getEmail());
       if (existingUser == null || !existingUser.getPassword().equals(user.getPassword())) {
           return ResponseEntity.badRequest().body("Account already exists!");
       }
       return ResponseEntity.ok().body("Login Successfully!");
   }
   @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
       User existingUser = userService.findByEmail(user.getEmail());
       if (existingUser != null) {
           return ResponseEntity.badRequest().body("Email already exists!");
       }
       userService.save(user);
       return ResponseEntity.ok().body("Successfully registered!");
   }
   }
