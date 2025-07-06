package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;

import java.util.List;

//added to introduce loose coupling and
public interface CategoryService {
List<Category>getAllCategories();
void createCategory(Category category);

String deleteCategory(Long categoryId);
}
