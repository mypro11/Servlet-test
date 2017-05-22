package com.brina.service;

import com.brina.model.User;

public interface UserService {

  User create(User user);
  User findById(Integer id);
  User findByToken(String token);
}
