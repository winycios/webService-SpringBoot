package com.winy_group.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winy_group.demo.entities.User;
import com.winy_group.demo.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findbyId(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
