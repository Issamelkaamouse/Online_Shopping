package com.issamelkaamouse.onlineshopping.utils;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.issamelkaamouse.onlineshopping.entities.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class Cart {
    private String cartId;
    private Double totalAmount;
//    @OneToMany
//    @JsonManagedReference
//    private List<Product> cartItems;
//    @OneToOne
//    @JoinColumn(name = "customer_id", unique = true)
//    private Visitor visitor;
}
