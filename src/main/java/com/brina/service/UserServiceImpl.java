package com.brina.service;

import com.brina.dao.UserDao;
import com.brina.model.User;

public class UserServiceImpl implements UserService {

  private final UserDao userDao;

  public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public User create(User user) {
    return userDao.create(user);
  }

  @Override
  public User findById(Integer id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public User findByToken(String token) {
    return userDao.findByToken(token);
  }
}
