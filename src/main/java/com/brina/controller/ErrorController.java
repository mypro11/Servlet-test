package com.brina.controller;

import com.brina.servlet.Request;
import com.brina.view.ViewModel;

public class ErrorController implements Controller{
  @Override
  public ViewModel process(Request request) {
    return new ViewModel("/error.jsp")
        .withAttribute("error", request.getParameter("error"));
  }
}
