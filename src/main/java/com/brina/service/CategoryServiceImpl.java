package com.brina.service;

import com.brina.dao.CategoryDao;
import com.brina.model.Category;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

  private final CategoryDao categoryDao;

  public CategoryServiceImpl(CategoryDao categoryDao) {
    this.categoryDao = categoryDao;
  }

  @Override
  public Category update(Category category) {
    return null;
  }

  @Override
  public List<Category> findAll() {
    return categoryDao.findAll();
  }

  @Override
  public Category create(Category category) {
    return categoryDao.create(category);
  }
}