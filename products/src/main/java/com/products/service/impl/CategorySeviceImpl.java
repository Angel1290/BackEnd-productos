package com.products.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.database.repository.CategoryRepository;
import com.products.entitys.Category;
import com.products.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategorySeviceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	/**
	 * metodo para consultar la lista de categorias
	 * 
	 * @return entidad de productos
	 */
	@Override
	public List<Category> listCategory() {

		List<Category> products = categoryRepository.findAll();

		if (products.isEmpty()) {
			log.info("No se encontraron datos");
		}

		return products;
	}

	/**
	 * metodo para consultar la lista de categorias
	 * 
	 * @parama entidad de productos
	 * @return entidad de productos
	 */
	@Override
	public Category saveCategory(Category category) {

		return categoryRepository.save(category);
	}

	/**
	 * metodo para consultar la lista de categorias
	 * 
	 * @parama entidad de productos
	 * @return entidad de productos
	 */
	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	/**
	 * metodo para consultar la lista de categorias
	 * 
	 * @parama idCategorias
	 * 
	 */
	@Override
	public void deleteCategory(int idCategory) {
		categoryRepository.deleteById(idCategory);

	}

}
