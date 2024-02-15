package com.issamelkaamouse.onlineshopping.repositories;

import com.issamelkaamouse.onlineshopping.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByRef(Long ref);
    Category findByName(String categName);
    List<Category> findCategoryByNameContains(String keyword);

}
