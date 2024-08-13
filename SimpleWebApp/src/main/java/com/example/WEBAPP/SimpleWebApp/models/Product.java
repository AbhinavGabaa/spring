package com.example.WEBAPP.SimpleWebApp.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

//@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private int prodId;
    private int price;
    private String prodName;

    public Product(int prodId, int price, String prodName) {
        this.prodId = prodId;
        this.price = price;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", price=" + price +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
