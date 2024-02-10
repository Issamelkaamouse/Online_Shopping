package com.issamelkaamouse.onlineshopping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private Double totalAmount;
    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;
    @OneToOne
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;
}
