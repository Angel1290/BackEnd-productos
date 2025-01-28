package com.products.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorys")
public class Category {

	@Id
	@Column(name = "id_category")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idCategory;

	private String category;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(Integer idCategory, String category) {
		super();
		this.idCategory = idCategory;
		this.category = category;
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", category=" + category + "]";
	}
	
	
	

}
