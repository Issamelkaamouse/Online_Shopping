package com.issamelkaamouse.onlineshopping.repositories;

import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
    OrderDetails findOrderDetailsById(Long id);
}
