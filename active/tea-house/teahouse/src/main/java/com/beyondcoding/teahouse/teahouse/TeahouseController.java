package com.beyondcoding.teahouse.teahouse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TeahouseController {

    private final TeaClient teaClient;

    private final DessertService dessertService;

    private String message = "No orders so far";

    public TeahouseController(TeaClient teaClient, DessertService dessertService) {
        this.teaClient = teaClient;
        this.dessertService = dessertService;
    }

    @ModelAttribute("message")
    String message() {
        return message;
    }

    @GetMapping
    String page() {
        return "teahouse";
    }

    @PostMapping("/tea")
    String tea() {
        message = teaClient.getTea();
        return "redirect:/";
    }

    @PostMapping("/dessert")
    String dessert() {
        message = dessertService.getDessert();
        return "redirect:/";
    }

}
