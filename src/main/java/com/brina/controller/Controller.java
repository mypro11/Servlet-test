package com.brina.controller;

import com.brina.servlet.Request;
import com.brina.view.ViewModel;

public interface Controller {

  ViewModel process(Request request);

}
