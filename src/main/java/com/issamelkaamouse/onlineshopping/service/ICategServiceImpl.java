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
        return categoryRepository.save(categ);
    }

    @Override
    public void deleteCategory(Long ref) {
        categoryRepository.delete(categoryRepository.findByRef(ref));
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long ref) {
        return categoryRepository.findByRef(ref);
    }

    @Override
    public List<Category> searchCategoriesByKeyword(String key) {
        return categoryRepository.findCategoryByNameContains(key);
    }

    @Override
    public Category updateCategory(Long ref, Category newCateg) {
        Category existingCategory = categoryRepository.findByRef(ref);
        existingCategory.setName(newCateg.getName());
        existingCategory.setDescription(newCateg.getDescription());
        return categoryRepository.save(existingCategory);
    }

}