package com.poc.imprimit_pdf.demo.service;

import com.poc.imprimit_pdf.demo.model.User;
import com.poc.imprimit_pdf.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }
}
