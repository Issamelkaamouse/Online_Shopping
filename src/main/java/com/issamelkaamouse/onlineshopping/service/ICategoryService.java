package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Category;

import java.util.List;

public interface ICategoryService {
    Category addCategory(Category categ);
    void deleteCategory(String categName);
    List<Category> getAllCategories();
    List<Category> searchCategoriesByKeyword(String key);
    Category updateCategory(Long ref,Category newCateg);
}
