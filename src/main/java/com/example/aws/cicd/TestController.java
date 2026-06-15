package com.example.aws.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    

    @GetMapping("/test")
    public String test() {
        return "My First AWS CICD Pipeline";
    }
}
