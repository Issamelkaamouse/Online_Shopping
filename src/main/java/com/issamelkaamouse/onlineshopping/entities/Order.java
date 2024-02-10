package com.issamelkaamouse.onlineshopping.entities;

import com.issamelkaamouse.onlineshopping.enums.deliveryMethod;
import com.issamelkaamouse.onlineshopping.enums.orderStatus;
import com.issamelkaamouse.onlineshopping.enums.paymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Data @NoArgsConstructor @AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private Date createdAt;
    private orderStatus status;
    private Double totalAmount;
    private deliveryMethod deliveryMode;
    private paymentMethod paymentMode;
    @OneToMany
    @JoinColumn(name = "order_id")
    private List<CartItem> orderItems;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
