package com.example.demo;
import com.example.demo.UserConfig.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    private final Map<String, User> users;
    @Autowired
    public UserService(Map<String, User> users) {
        this.users = users;
    }

    public String login(String email, String password) {
        User user = users.get(email);
        if (user != null && user.getPassword().equals(password)) {
            return "User logged in successfully.";
        } else {
            return "Invalid email or password.";
        }
    }
}
