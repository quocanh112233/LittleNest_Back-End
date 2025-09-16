package com.quocanh.littlenest.Service.Category;

import com.quocanh.littlenest.Entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
    List<Category> searchByName(String name);
}
