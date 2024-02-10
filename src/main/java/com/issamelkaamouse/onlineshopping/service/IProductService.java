package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.entities.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product p);
    void deleteProduct(String productName);
    List<Product> getAllProducts();
    List<Product> searchProductsByKeyword(String key);
    Product updateProduct(Long ref,Product newProduct);
}
