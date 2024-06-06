package com.souradip.projectproductservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souradip.projectproductservice.model.Product;
import com.souradip.projectproductservice.repo.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findProductById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		 return productRepository.findAll();
	}

	@Override
	public void createProduct(Product prod) {
		// TODO Auto-generated method stub
		productRepository.save(prod);
	}

//	@Override
//	public Product createProduct(String title, String description, String image, Double price, String category)
//			throws CategoryNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
