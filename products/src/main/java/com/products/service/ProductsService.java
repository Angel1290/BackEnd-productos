package com.products.service;

import java.util.List;

import com.products.entitys.Products;

public interface ProductsService {

	public List<Products> listProduct();

	public Products saveProduct(Products products);

	public Products updateProduct(Products products);

	public void deleteProduct(int idproduct);

}
