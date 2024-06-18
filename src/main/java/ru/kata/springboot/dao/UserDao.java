package ru.kata.springboot.dao;

import ru.kata.springboot.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAll();

    User getUserById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}
