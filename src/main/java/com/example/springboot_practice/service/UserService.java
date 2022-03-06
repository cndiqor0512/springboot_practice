package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.User;
import com.example.springboot_practice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getList() {
        return userRepository.getList();
    }

    public User getData(Long userId) {
        return userRepository.getData(userId);
    }
}
