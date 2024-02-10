package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.entities.Product;
import com.issamelkaamouse.onlineshopping.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class IProductServiceImpl implements IProductService {
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product p) {
        return null;
    }

    @Override
    public void deleteProduct(String productName) {

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public List<Product> searchProductsByKeyword(String key) {
        return null;
    }

    @Override
    public Product updateProduct(Long ref, Product newProduct) {
        return null;
    }
}
