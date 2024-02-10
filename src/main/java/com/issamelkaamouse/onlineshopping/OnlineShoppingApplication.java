package com.issamelkaamouse.onlineshopping;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.service.ICategServiceImpl;
import com.issamelkaamouse.onlineshopping.service.IProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication()
public class OnlineShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineShoppingApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IProductServiceImpl productService, ICategServiceImpl categoryService) {
        return args -> {

//            Stream.of("categ6").forEach(item->{
//                categoryService.deleteCategory(item);
//            });

            categoryService.getAllCategories().forEach(item->{
                System.out.println(item.getName());
            });
//            categoryService.searchCategoriesByKeyword("2").forEach(item->{
//                System.out.println(item.getName()+"-----"+item.getRef());
//            });

//            Category c = new Category();
//            c.setDescription("description updated");
//            c.setName("name updated");
//            categoryService.updateCategory(6L,c);
//
//            categoryService.getAllCategories().forEach(item->{
//                System.out.println(item.getName());
//            });

//            Stream.of("categ1", "categ2", "categ3").forEach(categ -> {
//                Category c = new Category();
//                c.setName(categ);
//                c.setDescription(categ + "  Some Description");
//                categoryService.saveCategory(c);
//            });
//            Stream.of("Product 1", "Product 2", "Product 3").forEach(product -> {
//                Product p = new Product();
//                p.setDesignation(product);
//                p.setDescription(product + "  Description");
//                p.setPrice(8000.0);
//                Category c = new Category();
//                c.setCategRef(4L);
//                p.setCategory(c);
//                productService.saveProduct(p);
//            });
        };
    }}
