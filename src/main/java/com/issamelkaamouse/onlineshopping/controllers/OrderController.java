package com.issamelkaamouse.onlineshopping.controllers;

import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
import com.issamelkaamouse.onlineshopping.service.IOrderServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private IOrderServiceImpl iOrderService;
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(iOrderService.viewAllOrders(), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        return new ResponseEntity<>(iOrderService.createOrder(order,order.getOrderDetails()),HttpStatus.CREATED);
    }
    @GetMapping("/order_details/{id}")
    public ResponseEntity<OrderDetails> getOrderDetails(@PathVariable("id") Long id){
        return new ResponseEntity<>(iOrderService.viewOrderDetails(id),HttpStatus.OK);
    }

    @PutMapping("update-order-status/{id}/{newStatus}")
    public ResponseEntity<Order> updateOrderStatus(@PathVariable("id") Long id,@PathVariable("newStatus") OrderStatus newStatus){
        return new ResponseEntity<>(iOrderService.updateOrderStatus(id,newStatus),HttpStatus.OK);
    }
    @PutMapping("update-payment-status/{id}/{newStatus}")
    public ResponseEntity<OrderDetails> updatePaymentStatus(@PathVariable("id") Long id,@PathVariable("newStatus") PaymentStatus newStatus){
        return new ResponseEntity<>(iOrderService.updatePaymentStatus(id,newStatus),HttpStatus.OK);
    }

}