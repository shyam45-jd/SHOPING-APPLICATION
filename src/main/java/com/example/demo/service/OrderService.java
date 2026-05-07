package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Place Order
    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    // Get All Orders
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get Order By Id
    public Orders getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Delete Order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}