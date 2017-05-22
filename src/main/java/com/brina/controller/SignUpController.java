package com.brina.controller;

import com.brina.servlet.Request;
import com.brina.view.ViewModel;

public class SignUpController implements Controller {
  @Override
  public ViewModel process(Request request) {
    return new ViewModel("/signup.jsp");
  }
}
