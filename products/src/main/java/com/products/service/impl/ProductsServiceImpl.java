package com.products.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.database.repository.ProductsRepository;
import com.products.entitys.Products;
import com.products.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	/**
	 * metodo para consultar la lista de productos
	 * 
	 * 
	 * @return lista de productos
	 */
	@Override
	public List<Products> listProduct() {

		return productsRepository.findAll();
	}

	/**
	 * metodo para guarda un productos
	 * 
	 * @param pasamos una entidad de productos
	 * @return entidad de productos
	 */
	@Override
	public Products saveProduct(Products products) {
		return productsRepository.save(products);
	}

	/**
	 * metodo para actualiza un productos
	 * 
	 * @param pasamos una entidad de productos
	 * @return entidad de productos
	 */
	@Override
	public Products updateProduct(Products products) {
		return productsRepository.save(products);

	}

	/**
	 * metodo para elimina un productos
	 * 
	 * @param id (id producto)
	 * @return
	 */
	@Override
	public void deleteProduct(int idproduct) {

		productsRepository.deleteById(idproduct);

	}

}
