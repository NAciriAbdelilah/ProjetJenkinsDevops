package com.example.ProjetJenkinsDevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/lab")
    public String getLab(){
        return"bonjour";
    }
}
