package com.souradip.projectproductservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souradip.projectproductservice.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	Category findByName(String name);

}
