package com.issamelkaamouse.onlineshopping.entities;

import com.issamelkaamouse.onlineshopping.enums.Gender;
import com.issamelkaamouse.onlineshopping.utils.Cart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int phoneNumber;
    private String streetAddress;
    private Gender gender;
    private String city;
//    @OneToMany(mappedBy = "customerFeedback")
//    private List<Feedback> feedbacks;
//    @OneToOne
//    @JoinColumn(name = "cart_id", unique = true)
//    private Cart cart;
//    @OneToMany(mappedBy = "customer")
//    private List<Order> orders;
}
