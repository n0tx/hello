package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
  
   @Override
    public void run(String args[]) throws Exception { 
        // Print statement when method is called 
        System.out.println("Hello world!, using command line runner..."); 
    } 
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}