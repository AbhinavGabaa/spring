package com.example.WEBAPP.SimpleWebApp.controllers;

import com.example.WEBAPP.SimpleWebApp.models.Product;
import com.example.WEBAPP.SimpleWebApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
    @GetMapping ("/products/{prodId}")
    public Product getProductByyId(@PathVariable int prodId)
    {
       return service.getProductById(prodId);
    }
    @PostMapping ("/products")
    public void addProducts(@RequestBody Product prodd)
    {
        System.out.println(prodd);
        service.addProduct(prodd);
    }
    @PutMapping ("/products")
    public void updateeProducts(@RequestBody Product prrr)
    {
        service.updateProducts(prrr);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteeProducts(@PathVariable int prodId)
    {
        service.deleteProduct(prodId);
    }
}
