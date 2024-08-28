package com.demo.simpleWebApp.service;

import com.demo.simpleWebApp.model.Product;
import com.demo.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Apple",50000),
//            new Product(102,"Realme",15000),
//            new Product(103,"Vivo",20000)
//    ));

    public List<Product> getProducts(){
//        return products;
        return repo.findAll();
    }


    public Product getProductById(int pid) {
//        return products.stream().filter(p -> p.getPid() == pid).findFirst().orElse(new Product(0,"No Items",0));
        return repo.findById(pid).orElse(new Product());
    }

    public void addProduct(Product product) {
//        products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product product) {
//        int index=0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getPid() == product.getPid()){
//                index = i;
//            }
//        }
//        products.set(index,product);
        repo.save(product);
    }

    public void deleteProdcut(int pid) {

//        i think you have to create a method for to get index here it not a good practice but
//        we are here to lear a new things so logic is now not important

//        int index=0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getPid() == pid){
//                index = i;
//            }
//        }
//        products.remove(index);
        repo.deleteById(pid);
    }
}
