package com.issamelkaamouse.onlineshopping.service;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;

public interface IOrderDetails {
    OrderDetails createOrderDetails(OrderDetails orderDetails);
    void updatePaymentStatus(Long id, PaymentStatus newStatus);
}
