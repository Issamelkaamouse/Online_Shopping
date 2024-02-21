package com.issamelkaamouse.onlineshopping;

import com.issamelkaamouse.onlineshopping.entities.Order;
import com.issamelkaamouse.onlineshopping.entities.OrderDetails;
import com.issamelkaamouse.onlineshopping.enums.OrderStatus;
import com.issamelkaamouse.onlineshopping.enums.PaymentStatus;
import com.issamelkaamouse.onlineshopping.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
public class OnlineShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineShoppingApplication.class, args);
    }

    @Bean
    CommandLineRunner start(IProductServiceImpl productService, ICategServiceImpl categoryService, IOrderServiceImpl iOrderService, IFeedbackServiceImpl iFeedbackService) {
        return args -> {
//
//            Stream.of("bad product how it work's","feedback 1 ", "feedback 2").forEach(f->{
//                Feedback feedback = new Feedback();
//                feedback.setFeedbackMsg(f);
//                iFeedbackService.addFeedback(feedback);
//            });


//            Stream.of(1,2,3,4,5).forEach(i->{
//                CartItem cartItem = new CartItem();
//                cartItem.setQuantity(i);
//                cartItemRepository.save(cartItem);
//            });

//            cartService.addProductToCart("9abd58e2-f550-4906-818c-b288a6c70298",cartItem);

//            Stream.of(2.0,3.0,4.0,5.0).forEach(i->{
//                Cart c = new Cart();
//                c.setTotalAmount(i);
//                Visitor visitor = new Visitor();
//                visitor.setSessionId(i+" -->  session id");
//                visitorRepository.save(visitor);
//                c.setVisitor(visitor);
//                cartService.createCart(c);
//            });

//            Order order = new Order();
//            order.setStatus(OrderStatus.PENDING);
//            order.setTotalAmount(39500.0);
//            OrderDetails oD = new OrderDetails();
//            oD.setPaymentStatus(PaymentStatus.UNPAID);
//            oD.setOrder(order);
//            order.setOrderDetails(oD);
//            iOrderService.createOrder(order,oD);
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
