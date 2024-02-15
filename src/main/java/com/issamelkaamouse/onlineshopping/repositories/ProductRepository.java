package com.issamelkaamouse.onlineshopping.repositories;

import com.issamelkaamouse.onlineshopping.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByRef(Long ref);
    List<Product> findProductByDesignationContains(String keyword);
}
