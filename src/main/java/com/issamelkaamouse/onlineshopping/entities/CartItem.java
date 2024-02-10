package com.issamelkaamouse.onlineshopping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class CartItem extends Product{
    private int quantity=1;
    private Date addedToCartAt;
    private Double totalPrice;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
