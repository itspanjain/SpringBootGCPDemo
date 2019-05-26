package com.example.SpringBootGCPDemo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCPController {
    @RequestMapping("/")
    public String app(){
        return "This is Spring Boot App Deployed on GCP...!!!";
    }
}

