package com.issamelkaamouse.onlineshopping.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ref;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Product> CategProducts = new ArrayList<>();
}
