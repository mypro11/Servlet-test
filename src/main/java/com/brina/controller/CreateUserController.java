package com.brina.controller;

import com.brina.model.User;
import com.brina.service.UserService;
import com.brina.servlet.Request;
import com.brina.view.ViewModel;
import org.apache.log4j.Logger;


public class CreateUserController implements Controller {

  private final Logger logger = Logger.getLogger(CreateUserController.class);
  private final UserService service;

  public CreateUserController(UserService service) {
    this.service = service;
  }

  @Override
  public ViewModel process(Request request) {

    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    String token = userName + System.nanoTime();

    service.create(User.from(userName, password, token));
    return new ViewModel("/profile.jsp")
        .addCookie("token", token);
  }
}
