package com.beyondcoding.basic.communicationui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CommunicationController {

    private final CommunicationGateway communicationGateway;

    private String communication = "No message so far";

    public CommunicationController(CommunicationGateway communicationGateway) {
        this.communicationGateway = communicationGateway;
    }

    @ModelAttribute("communication")
    String communication() {
        return communication;
    }

    @GetMapping
    String page() {
        return "index";
    }

    @PostMapping("/greeting")
    String greeting() {
        communication = communicationGateway.getGreeting();
        return "redirect:/";
    }

    @PostMapping("/message")
    String message() {
        communication = communicationGateway.getMessage();
        return "redirect:/";
    }

}
