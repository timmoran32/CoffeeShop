package com.example.CoffeeShop.Controllers;


import com.example.CoffeeShop.Controllers.exceptions.NotFoundException;
import com.example.CoffeeShop.model.Order;
import com.example.CoffeeShop.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/orders")
public class OrderController {

    private OrderRepository orderRepository;


    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public String placeOrder(@RequestBody Order order){
        orderRepository.saveOrder(order);
        return "Order placed";
    }

    //check order status

    //get order by UUID
    @GetMapping("{id}")
    public Order getOrder(@PathVariable(name="id") String id){
        return orderRepository.getOrder(id).orElseThrow(() -> new NotFoundException("Order Not Found"));
    }

    //get all orders
    @GetMapping
    public List<Order> getAllOrders(){
        return orderRepository.getAll();
    }
}
