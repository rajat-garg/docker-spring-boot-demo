package com.fico.docker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/")
public class Hello {

    @GetMapping
    public String getHello() {
        return "Hello Docker!!!";
    }
}
