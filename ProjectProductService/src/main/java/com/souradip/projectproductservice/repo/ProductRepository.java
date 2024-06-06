package com.souradip.projectproductservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souradip.projectproductservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findProductById(Integer id);

	Product findByDescription(String description);

}
