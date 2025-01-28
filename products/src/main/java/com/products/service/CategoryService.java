package com.products.service;

import java.util.List;

import com.products.entitys.Category;

public interface CategoryService {

	public List<Category> listCategory();
	
	public Category saveCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public void deleteCategory(int idCategory);
}
