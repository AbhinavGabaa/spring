package com.example.WEBAPP.SimpleWebApp.services;

import com.example.WEBAPP.SimpleWebApp.models.Product;
import com.example.WEBAPP.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,122222,"ABHINAV"),new Product(102,333332,"Gaba")));
    public List<Product> getProducts(){

        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod)
        {
            repo.save(prod);
        }

    public void updateProducts(Product prr) {

//        int index = 0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == prr.getProdId()){
//                index = i;
//            }
//        }
            repo.save(prr);

    }
    public void deleteProduct(int prodId)
        {
            repo.deleteById(prodId);
        }

}

