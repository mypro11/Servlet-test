package com.brina.controller;

import com.brina.model.Category;
import com.brina.service.CategoryService;
import com.brina.servlet.Request;
import com.brina.view.ViewModel;

import java.util.List;

public class GetAllCategoriesController implements Controller {

  private final CategoryService service;

  public GetAllCategoriesController(CategoryService service) {
    this.service = service;
  }

  @Override
  public ViewModel process(Request request) {
    List<Category> categories = service.findAll();
    return new ViewModel("/categories.jsp")
        .withAttribute("categories", categories);
  }
}
