package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.repositories.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ICategServiceImpl implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category addCategory(Category categ) {
        categoryRepository.save(categ);
        return categ;
    }

    @Override
    public void deleteCategory(String categName) {
        categoryRepository.deleteByName(categName);
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    @Override
    public List<Category> searchCategoriesByKeyword(String key) {
        List<Category> fetchedCategories = categoryRepository.findCategoryByNameContains(key);
        return fetchedCategories;
    }

    @Override
    public Category updateCategory(Long ref, Category newCateg) {
        Category existingCategory = categoryRepository.findByRef(ref);
        existingCategory.setName(newCateg.getName());
        existingCategory.setDescription(newCateg.getDescription());
        return categoryRepository.save(existingCategory);
    }

}
