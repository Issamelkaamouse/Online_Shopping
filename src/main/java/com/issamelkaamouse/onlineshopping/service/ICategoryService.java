package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Category;

import java.util.List;

public interface ICategoryService {
    Category addCategory(Category categ);
    void deleteCategory(Long ref);
    List<Category> getAllCategories();
    Category getCategory(Long ref);
    List<Category> searchCategoriesByKeyword(String key);
    Category updateCategory(Long ref,Category newCateg);

}
