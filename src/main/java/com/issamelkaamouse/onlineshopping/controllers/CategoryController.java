package com.issamelkaamouse.onlineshopping.controllers;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.entities.Product;
import com.issamelkaamouse.onlineshopping.service.ICategoryService;
import com.issamelkaamouse.onlineshopping.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class CategoryController {
    private ICategoryService iCategoryService;
    private IProductService iProductService;
    @GetMapping
    public ResponseEntity<List<Category>> getCategories(){
        return new ResponseEntity<>(iCategoryService.getAllCategories(),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Category> addCategory(@RequestBody Category c){
        return new ResponseEntity<>(iCategoryService.addCategory(c), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable("id") Long id){
        return new ResponseEntity<>(iCategoryService.getCategory(id),HttpStatus.OK);
    }
    @GetMapping("/search/{key}")
    public ResponseEntity<List<Category>> searchCategoriesByKeyword(@PathVariable("key") String key){
        return new ResponseEntity<>(iCategoryService.searchCategoriesByKeyword(key),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Long id){
        iCategoryService.deleteCategory(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long ref,@RequestBody Category c){
        return new ResponseEntity<>(iCategoryService.updateCategory(ref,c),HttpStatus.OK);
    }

}

