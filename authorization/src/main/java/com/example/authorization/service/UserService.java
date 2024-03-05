package com.example.authorization.service;

import com.example.authorization.entity.User;
import com.example.authorization.exception.RecordNotFoundException;
import com.example.authorization.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public User getUserByName(String name) {
        return userRepo.findByUserName(name).orElseThrow(() -> new RecordNotFoundException("User : " + name + " doesn't exist"));
    }

    public User updateUser(int id, String password) {
        User existingUser = userRepo.findById(id)
                .orElseThrow(() -> new RecordNotFoundException("User not found with id : " + id));
        existingUser.setPassword(password);
        return userRepo.save(existingUser);

    }

}
