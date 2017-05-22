package com.brina.controller;

import com.brina.servlet.Request;
import com.brina.view.ViewModel;

public class ProfileController implements Controller {


  @Override
  public ViewModel process(Request request) {
    String userId = request.getParameter("userId");

    return new ViewModel("/profile.jsp");
  }
}
