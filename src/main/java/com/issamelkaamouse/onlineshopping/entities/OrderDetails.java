package com.issamelkaamouse.onlineshopping.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.issamelkaamouse.onlineshopping.enums.DeliveryMethod;
import com.issamelkaamouse.onlineshopping.enums.PaymentMethod;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
import com.issamelkaamouse.onlineshopping.utils.CartItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMode;
    private DeliveryMethod deliveryMode;


    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "order_id",  unique = true)
    private Order order;

    @OneToMany
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Product> orderItems;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}