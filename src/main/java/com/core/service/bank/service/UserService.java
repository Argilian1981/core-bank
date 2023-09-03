package com.core.service.bank.service;

import com.core.service.bank.model.User;
import com.core.service.bank.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<String> createUser(User user){
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
