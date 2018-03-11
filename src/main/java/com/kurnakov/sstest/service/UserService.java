package com.kurnakov.sstest.service;

import com.kurnakov.sstest.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void save(User user);
    Optional<User> getById(long id);
    List<User> getAll();
    void deleteById(long id);
    void deleteAll();

}
