package com.demo.simpleWebApp.controller;

import com.demo.simpleWebApp.model.Product;
import com.demo.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{pid}")
    public Product getProductById(@PathVariable int pid){
        return service.getProductById(pid);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{pid}")
    public void deleteProduct(@PathVariable int pid){
        service.deleteProdcut(pid);
    }

}
