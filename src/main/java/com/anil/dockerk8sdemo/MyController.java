package com.anil.dockerk8sdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/welcome")
    public String getData(){
        return "Congratulation!!! you have successfully containerize V2 of java application and deploy on Kubernetes!!!";
    }

}
