package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableJpaRepositories(basePackages = "com.example.demo")


/**
 * A class that contains the main method for the application. The purpose is to create
 * simple web application that allows users to search for and view information about movies or books.
 * 
 * @author Filip Dimitrijevic
 * @date 2023-01-23
 */

 public class App {
     public static void main(String[] args) {
         SpringApplication.run(App.class, args);
     }
 }
 