package com.issamelkaamouse.onlineshopping.controllers;

import com.issamelkaamouse.onlineshopping.entities.Product;
import com.issamelkaamouse.onlineshopping.service.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private IProductService iProductService;
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(iProductService.getAllProducts(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product p){
        return new ResponseEntity<>(iProductService.addProduct(p),HttpStatus.CREATED);
    }

    @DeleteMapping("/{ref}")
    public void deleteProduct(@PathVariable("ref") Long ref){
        iProductService.deleteProduct(ref);
    }

    @PutMapping("/{ref}")
    public ResponseEntity<Product> updateProduct(@PathVariable("ref") Long ref,@RequestBody Product newProduct){
        return new ResponseEntity<>(iProductService.updateProduct(ref,newProduct),HttpStatus.OK);
    }

    @GetMapping("/search/{key}")
    public ResponseEntity<List<Product>> searchProducts(@PathVariable("key") String keyword){
        return new ResponseEntity<>(iProductService.searchProductsByKeyword(keyword),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long ref){
        return new ResponseEntity<>(iProductService.getProduct(ref),HttpStatus.OK);
    }

    @GetMapping("affectProductToCategory/{ref}/{categName}")
    public ResponseEntity<Product> affectProductToCategory(@PathVariable("ref") Long ref,@PathVariable("categName") String categName){
        return new ResponseEntity<>(iProductService.affectProductToCategory(ref,categName),HttpStatus.OK);
    }
}
