package com.example.dockerstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, world!";
  }

  @GetMapping("/echo/{message}")
  public String echoMessage(@PathVariable String message) {
    return "You said: " + message;
  }
}
