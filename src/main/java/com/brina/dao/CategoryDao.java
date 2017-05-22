package com.brina.dao;

import com.brina.model.Category;

import java.util.List;

public interface CategoryDao extends GenericDao<Category> {
  List<Category> findAll();
}
