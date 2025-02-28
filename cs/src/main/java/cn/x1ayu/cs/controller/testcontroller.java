package cn.x1ayu.cs.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testcontroller {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}