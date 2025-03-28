package dev.dans.barbearia.service;

import dev.dans.barbearia.model.entity.User;

import java.util.List;

public interface IUserService {
    User save(User entity);
    List<User> findAll();
    User findById(long id);
    User update(User entity);
    void delete(long id);
}
