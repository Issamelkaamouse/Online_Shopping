package com.issamelkaamouse.onlineshopping.controllers;

import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
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
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable("id") Long id){
        return new ResponseEntity<>(iOrderService.getOrder(id),HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        return new ResponseEntity<>(iOrderService.createOrder(order),HttpStatus.CREATED);
    }
    @GetMapping("/order_details/{id}")
    public ResponseEntity<OrderDetails> getOrderDetails(@PathVariable("id") Long id){
        return new ResponseEntity<>(iOrderService.viewOrderDetails(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public void updateOrderStatus(@PathVariable("id") Long id,@RequestBody OrderStatus newStatus){
        iOrderService.updateOrderStatus(id,newStatus);
    }



}
