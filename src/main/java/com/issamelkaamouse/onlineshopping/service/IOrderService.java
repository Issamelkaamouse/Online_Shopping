package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;

import java.util.List;

public interface IOrderService {
    Order createOrder(Order order);
    OrderDetails viewOrderDetails(Long orderId);
    List<Order> viewAllOrders();
    Order getOrder(Long id);
    void updateOrderStatus(Long id, OrderStatus  newStatus);
//    void updatePaymentStatus(Long id, PaymentStatus newStatus);
}
