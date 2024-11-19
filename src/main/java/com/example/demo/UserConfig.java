package com.example.demo;


import lombok.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class UserConfig {

    @Bean
    public Map<String, User> users() {
        Map<String, User> users = new HashMap<>();
        users.put("pavan@gmail.com", new User("pavan@gmail.com", "password123", "123 Main St", "Example City", "123456"));
        users.put("1a7@gmail.com", new User("1a7@gmail.com", "password456", "456 Another St", "Another City", "654321"));
        return users;
    }

    @Getter
    public static class User {
        // Getters and Setters
        private String email;
        private String password;
        private String address;
        private String city;
        private String pincode;

        public User(String email, String password, String address, String city, String pincode) {
            this.email = email;
            this.password = password;
            this.address = address;
            this.city = city;
            this.pincode = pincode;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }
    }
}

