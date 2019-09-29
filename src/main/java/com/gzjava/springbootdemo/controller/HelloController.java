package com.gzjava.springbootdemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello world, 11111!";
    }

    @RequestMapping("hello/{name}")
    @ResponseBody
    public String SayHello(@PathVariable() String name) {
        return name+"，Welcome!";
    }
}
