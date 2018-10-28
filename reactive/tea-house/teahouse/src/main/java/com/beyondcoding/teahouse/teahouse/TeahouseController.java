package com.beyondcoding.teahouse.teahouse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TeahouseController {

    private final OrderDispatcher orderDispatcher;

    private final ProductService productService;

    public TeahouseController(OrderDispatcher orderDispatcher, ProductService productService) {
        this.orderDispatcher = orderDispatcher;
        this.productService = productService;
    }

    @ModelAttribute("message")
    String message() {
        return productService.getMessage();
    }

    @GetMapping
    String page() {
//        model.addAttribute("message", productService.getMessage());
        return "teahouse";
    }

    @PostMapping("/tea")
    String tea() {
        orderDispatcher.orderTea();
        productService.setMessage("Tea Ordered");
        return "redirect:/";
    }

    @PostMapping("/dessert")
    String dessert() {
        orderDispatcher.orderDessert();
        productService.setMessage("Dessert Ordered");
        return "redirect:/";
    }

}
