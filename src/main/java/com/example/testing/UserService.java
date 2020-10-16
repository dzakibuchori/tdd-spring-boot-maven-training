package com.example.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity getById(Long id) {
        return userRepository.findById(id).get();
    }

    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
}
