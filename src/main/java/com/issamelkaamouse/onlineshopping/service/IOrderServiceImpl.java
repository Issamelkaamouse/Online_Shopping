package com.issamelkaamouse.onlineshopping.service;

import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
import com.issamelkaamouse.onlineshopping.repositories.OrderDetailsRepository;
import com.issamelkaamouse.onlineshopping.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class IOrderServiceImpl implements IOrderService {
    private OrderRepository orderRepository;
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public Order createOrder(Order order,OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
        return orderRepository.save(order);
    }

    @Override
    public OrderDetails viewOrderDetails(Long orderId) {
        return orderRepository.findByOrderId(orderId).getOrderDetails();
    }

    @Override
    public List<Order> viewAllOrders() {
        return orderRepository.findAll();
    }



    @Override
    public Order updateOrderStatus(Long id,OrderStatus newStatus) {
        Order o = orderRepository.findByOrderId(id);
        o.setStatus(newStatus);
        orderRepository.save(o);
        return o;
    }

    @Override
    public OrderDetails updatePaymentStatus(Long id, PaymentStatus newStatus) {
        OrderDetails orderDetails = orderDetailsRepository.findOrderDetailsById(id);
//        Order order = orderRepository.findByOrderId(id);
//        OrderDetails orderDetails = order.getOrderDetails();
        orderDetails.setPaymentStatus(newStatus);
//        orderDetails.setOrder(order);

        return  orderDetailsRepository.save(orderDetails);
    }
}
