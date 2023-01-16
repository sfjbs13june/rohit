package com.rohit.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
    @GetMapping("/greet")
    public String DoGreet()
    {
        return "greet from app";
    }

    @GetMapping("/welcome")
    public String SayWelcome()
    {
        return "welcome from app";
    }

    @GetMapping("/hi")
    public String SayHi()
    {
        return "hi from app";
    }

    @GetMapping("/thanks")
    public String SayThanks()
    {
        return "thanks from app";
    }
}
