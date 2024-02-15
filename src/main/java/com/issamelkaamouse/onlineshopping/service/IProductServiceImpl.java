package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.entities.Product;
import com.issamelkaamouse.onlineshopping.repositories.CategoryRepository;
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
    private CategoryRepository categoryRepository;

    @Override
    public Product addProduct(Product p) {
        productRepository.save(p);
        return p;
    }

    @Override
    public void deleteProduct(Long ref) {
        productRepository.delete(productRepository.findByRef(ref));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long ref) {
        return productRepository.findByRef(ref);
    }

    @Override
    public List<Product> searchProductsByKeyword(String key) {
        return productRepository.findProductByDesignationContains(key);
    }

    @Override
    public Product updateProduct(Long ref, Product newProduct) {
        Product existingProduct = productRepository.findByRef(ref);
        existingProduct.setDescription(newProduct.getDescription());
        existingProduct.setDesignation(newProduct.getDesignation());
        existingProduct.setPrice(newProduct.getPrice());
        return productRepository.save(existingProduct);
    }

    @Override
    public Product affectProductToCategory(Long productRef, String categName) {
        Product p = productRepository.findByRef(productRef);
        p.setCategory(categoryRepository.findByName(categName));
        return p;
    }
}
