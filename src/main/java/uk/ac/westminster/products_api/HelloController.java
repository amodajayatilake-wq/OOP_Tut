package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boots!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running - Tutorial 1";
    }

    @GetMapping("/goodbye")
    public String goodbye() { return "Goodbye from Spring Boot!"; }

}
