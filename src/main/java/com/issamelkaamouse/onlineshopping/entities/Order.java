package com.issamelkaamouse.onlineshopping.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.issamelkaamouse.onlineshopping.enums.DeliveryMethod;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
import com.issamelkaamouse.onlineshopping.enums.PaymentMethod;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
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
    private Date createdAt = new Date();
    private Double totalAmount;
    private OrderStatus status = OrderStatus.PENDING;
    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "order_details_id", unique = true)
    private OrderDetails orderDetails;
}