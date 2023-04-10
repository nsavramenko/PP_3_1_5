package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    User findByEmail(String email);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUser(Long id);
    User findUserById(Long id);
    List<User> allUsers();
    boolean emailExists(User user);

}
