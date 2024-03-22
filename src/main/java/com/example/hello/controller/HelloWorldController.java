package com.example.hello.controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
  
@RestController
public class HelloWorldController { 
    @RequestMapping("/hello") public String helloworld() 
    { 
        return "<h3>Hello World!</h3>"; 
    }
}
  