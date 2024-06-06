package com.souradip.projectproductservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
	private String description;
	private String price;
	private String imageURL;

	@ManyToOne(cascade = { CascadeType.REMOVE })
	@JsonIgnore
	private Category category; // this is not a collection.
}
