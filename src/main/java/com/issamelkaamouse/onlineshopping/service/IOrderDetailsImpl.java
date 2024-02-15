package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
import com.issamelkaamouse.onlineshopping.repositories.OrderDetailsRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class IOrderDetailsImpl implements IOrderDetails {
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    @Override
    public void updatePaymentStatus(Long id, PaymentStatus newStatus) {
        OrderDetails orderDetails = orderDetailsRepository.findOrderDetailsById(id);
        orderDetails.setPaymentStatus(newStatus);
        orderDetailsRepository.save(orderDetails);
    }
}
