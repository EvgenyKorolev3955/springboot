package ru.kata.springboot.service;

import ru.kata.springboot.models.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getUserById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}
