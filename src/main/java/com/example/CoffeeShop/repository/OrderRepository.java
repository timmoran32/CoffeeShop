package com.example.CoffeeShop.repository;


import com.example.CoffeeShop.model.Order;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class OrderRepository {

    private Map<String, Order> orders = new HashMap<>();

    public void saveOrder(Order order) {
        orders.put(order.getOrderNumber(), order);
    }

    public Optional<Order> getOrder(String id) {
        return Optional.ofNullable(orders.get(id));
    }

    public List<Order> getAll(){
        return new ArrayList<>(orders.values());
    }


}
