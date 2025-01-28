package com.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.entitys.Category;
import com.products.service.CategoryService;
import com.products.utils.ConstantesGlobales;

import io.swagger.oas.annotations.Operation;

@RequestMapping(value = "v1/servicio")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {

	@Autowired
	private CategoryService categorySevice;

	/**
	 * Expone el endpoint para obtener lista de productos
	 * 
	 * @return lista de produtos
	 * @parama Resquest list of products
	 */
	@Operation(method = "list category", description = "category list query")
	@GetMapping(value = ConstantesGlobales.QUERY_LIST_CATEGORY)
	public ResponseEntity<?> listCategory() {
		return new ResponseEntity<>(this.categorySevice.listCategory(), HttpStatus.OK);
	}

	/**
	 * Expone el endpoint de guardar producto
	 * 
	 * @return estatus 200
	 * @parama entidad de productos
	 */
	@Operation(method = "save product", description = "save products")
	@PostMapping(value = ConstantesGlobales.SAVECA_TEGORY)
	public ResponseEntity<?> saveProduct(@RequestBody Category category) {
		return new ResponseEntity<>(this.categorySevice.saveCategory(category), HttpStatus.OK);
	}

	/**
	 * Expone el endpoint de actualizar producto
	 * 
	 * @return estatus 200
	 * @parama entidad de productos
	 */
	@Operation(method = "update product", description = "update products")
	@PutMapping(value = ConstantesGlobales.UPDATE_CATEGORY)
	public ResponseEntity<?> updateProduct(@RequestBody Category category) {
		return new ResponseEntity<>(this.categorySevice.updateCategory(category), HttpStatus.OK);
	}

	/**
	 * Expone el endpoint de eliminacion de un producto
	 * 
	 * @return estatus 200 y un mensaje de Registro Eliminado
	 * @parama integer id(producto)
	 */
	@Operation(method = "delete product", description = "delete products")
	@DeleteMapping(value = ConstantesGlobales.DELETE_CATEGORY)
	public ResponseEntity<?> deleteProduct(@PathVariable int id) {
		this.categorySevice.deleteCategory(id);
		return ResponseEntity.ok("Registro Eliminado");
	}

}
