package com.souradip.projectproductservice.service;

import java.util.List;

import com.souradip.projectproductservice.exception.CategoryNotFoundException;
import com.souradip.projectproductservice.model.Product;

public interface ProductService {
	
	Product getProductById(Integer id);

    List<Product> getAllProducts(); // not paginated. This will return you all the products.

//    Product createProduct(String title, String description,
//                          String image, Double price, String category) throws CategoryNotFoundException;
    void createProduct(Product prod);



}
