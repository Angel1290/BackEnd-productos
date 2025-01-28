package com.products.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@Column(name = "id_product")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idProduct;
		
	@Column(name= "nombre_product")
	private String nombreProduct;

	private String price;

	private String category;

	public Products() {
		// TODO Auto-generated constructor stub
	}

	

	public Products(int idProduct, String nombreProduct, String price, String category) {
		super();
		this.idProduct = idProduct;
		this.nombreProduct = nombreProduct;
		this.price = price;
		this.category = category;
	}



	public int getIdProduct() {
		return idProduct;
	}



	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}



	public String getNombreProduct() {
		return nombreProduct;
	}



	public void setNombreProduct(String nombreProduct) {
		this.nombreProduct = nombreProduct;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Produts [idProduct=" + idProduct + ", nombreProduct=" + nombreProduct + ", price=" + price
				+ ", category=" + category + "]";
	}



	

}
