package com.veespark.users.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.veespark.users.model.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final ObjectMapper objectMapper;
    private List<User> users;
    
    public UserRepository(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        loadUsers();
    }
    
    private void loadUsers() {
        try {
            ClassPathResource resource = new ClassPathResource("data/users.json");
            users = objectMapper.readValue(resource.getInputStream(), new TypeReference<List<User>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to load users data", e);
        }
    }
    
    public List<User> findAll() {
        return users;
    }
    
    public Optional<User> findById(String id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}