package com.issamelkaamouse.onlineshopping.repositories;

import com.issamelkaamouse.onlineshopping.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
