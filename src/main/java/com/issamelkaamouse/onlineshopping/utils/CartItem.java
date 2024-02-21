package com.issamelkaamouse.onlineshopping.utils;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.issamelkaamouse.onlineshopping.entities.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
public class CartItem  {
    private Long cartItemId;
    private Product product;

//    @ManyToOne
//    @JoinColumn(name = "cart_id")
//    @JsonBackReference
    private Cart cart;
}
