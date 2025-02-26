package com.example.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model; 

import com.example.assignment1.model.Order;

@Controller
public class OrderController {

    @GetMapping("/")
    public String index() {
        return "index";  // This will render index.html from the templates folder
    }

    @PostMapping("/submitOrder")
    public String submitOrder(Order order, Model model) {
        double total = order.getPhonePrice() * order.getQuantity();
        model.addAttribute("order", order);
        model.addAttribute("total", total);
        return "show-order";  // This will render show-order.html
    }

    @GetMapping("/home")
    public String homePage() {
        return "HomePage";  // This will render HomePage.html
    }
}