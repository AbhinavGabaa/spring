package com.example.WEBAPP.SimpleWebApp.repository;

import com.example.WEBAPP.SimpleWebApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
