package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
    User findUserById(Long id);
    List<User> allUsers();

}
