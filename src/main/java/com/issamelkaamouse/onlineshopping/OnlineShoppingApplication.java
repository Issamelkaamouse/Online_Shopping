package com.issamelkaamouse.onlineshopping;

import com.issamelkaamouse.onlineshopping.entities.Category;
import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.entities.Product;
import com.issamelkaamouse.onlineshopping.enums.DeliveryMethod;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
import com.issamelkaamouse.onlineshopping.enums.PaymentMethod;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
import com.issamelkaamouse.onlineshopping.service.ICategServiceImpl;
import com.issamelkaamouse.onlineshopping.service.IOrderDetailsImpl;
import com.issamelkaamouse.onlineshopping.service.IOrderServiceImpl;
import com.issamelkaamouse.onlineshopping.service.IProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication()
public class OnlineShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineShoppingApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IProductServiceImpl productService, ICategServiceImpl categoryService, IOrderServiceImpl iOrderService, IOrderDetailsImpl iOrderDetails) {
        return args -> {

//                Order o = new Order();
//                o.setStatus(OrderStatus.PENDING);
//                o.setTotalAmount(39500.0);
//                OrderDetails orderDetails =  new OrderDetails();
//                o.setOrderDetails(iOrderDetails.createOrderDetails(orderDetails));
//                iOrderService.createOrder(o);
//            System.out.println(o.getOrderDetails().getId());
//            iOrderService.createOrder(o);
//            iOrderService.createOrder(o1);

//            Stream.of("p1", "p2", "p3","p4","p5").forEach(item->{
//                Product p = new Product();
//                p.setDesignation(item);
//                p.setDescription(item+"  description ");
//                productService.addProduct(p);
//            });

//            productService.deleteProduct(1L);
//            Product p = new Product();
//            p.setPrice(80D);
//            p.setDescription("descr updated");
//            p.setDesignation("product name updated");
//            productService.updateProduct(5L,p);
//            productService.searchProductsByKeyword("name").forEach(item->{
//                System.out.println(item.getDesignation());
//            });

//            productService.affectProductToCategory(2L,"issam");

//            System.out.println(productService.getProduct(2L).getCategory().getName());

//            categoryService.getCategory(7L).getCategProducts().forEach(item->{
//                System.out.println(item.getDescription() + "  --->  "+ item.getCategory().getName());
//            });

//            Category c = new Category();
//            c.setName("issam");
//            c.setDescription("issam desc");
//            categoryService.addCategory(c);

//            Stream.of(5L).forEach(item->{
//                categoryService.deleteCategory(item);
//            });
//
//            categoryService.getAllCategories().forEach(item->{
//                System.out.println(item.getName());
//            });
//            categoryService.searchCategoriesByKeyword("2").forEach(item->{
//                System.out.println(item.getName()+"-----"+item.getRef());
//            });

//            Category c = new Category();
//            c.setDescription("description updated");
//            c.setName("name updated");
//            categoryService.updateCategory(6L,c);
//

//            Stream.of("categ1", "categ2", "categ3").forEach(categ -> {
//                Category c = new Category();
//                c.setName(categ);
//                c.setDescription(categ + "  Some Description");
//                categoryService.saveCategory(c);
//            });
//            Stream.of("Product 1", "Product 2", "Product 3").forEach(product -> {
//                Product p = new Product();
//                p.setDesignation(product);
//                p.setDescription(product + "  Description");
//                p.setPrice(8000.0);
//                productService.addProduct(p);
//            });
        };
    }}
