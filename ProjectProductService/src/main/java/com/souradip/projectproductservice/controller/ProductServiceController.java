package com.souradip.projectproductservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.souradip.projectproductservice.model.Product;
import com.souradip.projectproductservice.service.ProductService;

@RestController
public class ProductServiceController {

   private ProductService productService;
   
   public ProductServiceController(ProductService productService) {
	   this.productService = productService;
   }
	
   @PostMapping("/product")
	public void createProduct(@RequestBody Product prod) {
		
		productService.createProduct(prod);
		
    }

}
