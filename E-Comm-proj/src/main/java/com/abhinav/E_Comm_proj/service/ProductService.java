package com.abhinav.E_Comm_proj.service;

import com.abhinav.E_Comm_proj.model.Product;
import com.abhinav.E_Comm_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
