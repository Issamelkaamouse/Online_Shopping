package com.issamelkaamouse.onlineshopping.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ref;
    @Column(unique = true)
    private String designation;
    private String description;
    private Double price;
    private int quantity=1;
    private Date addedToCartAt;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
