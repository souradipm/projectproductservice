package com.souradip.projectproductservice.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseModel implements Serializable{

	private String name;
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<Product> products;
}
