package com.kurnakov.sstest.controller;

import com.kurnakov.sstest.entity.User;
import com.kurnakov.sstest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void saveUser(@RequestBody User user){
        service.save(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){
        service.save(user);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return service.getAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable long id){
        service.deleteById(id);
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public void deleteAllUsers(){
        service.deleteAll();
    }



}
