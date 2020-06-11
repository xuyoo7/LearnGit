package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuyoo
 * @description hiSpring
 * @date 2020-06-11
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/spring")
    public String hello(){
        return "helloSpring";
    }
}
