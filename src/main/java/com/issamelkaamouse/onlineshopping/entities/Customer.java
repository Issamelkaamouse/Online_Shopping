package com.issamelkaamouse.onlineshopping.entities;

import com.issamelkaamouse.onlineshopping.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Customer extends Visitor{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int phoneNumber;
    private String streetAddress;
    private Gender gender;
    private String city;
    @OneToMany(mappedBy = "customerFeedback")
    private List<Feedback> feedbacks;
    @OneToOne
    @JoinColumn(name = "cart_id", unique = true)
    private Cart cart;
//    @OneToMany(mappedBy = "customer")
//    private List<Order> orders;
}
