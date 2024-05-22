// Java Program to Illustrate DemoController File

// Importing package in this code module
package com.example.test;
// Importing required classes
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
@RequestMapping("/api/products/")
// Main class
public class ProductController {

    @Autowired
    ProductService productService;
      @GetMapping
    public String Products (@RequestParam(value = "param", required = false) String param){
          if (param != null){
              return "Received Parameter"+param;
          }
        String temp = productService.getAllProducts();
        return temp;
    }
}

