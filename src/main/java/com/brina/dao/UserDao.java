package com.brina.dao;

import com.brina.model.User;

public interface UserDao extends GenericDao<User> {

  User findByToken(String token);
}
