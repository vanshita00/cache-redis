package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {
    public User getUser(long id);
    public List<User> getAll();
    public void delete(long id);
    public User update(User user);
    public User create(User user);
}
