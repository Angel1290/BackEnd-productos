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

import com.products.entitys.Products;
import com.products.service.ProductsService;
import com.products.utils.ConstantesGlobales;

import io.swagger.oas.annotations.Operation;


@RequestMapping(value = "v2/servicio")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	/**
	 * Expone el endpoint para obtener lista de categorias
	 * 
	 * @return lista de categorias
	 * @parama Resquest list of category
	 */
	@Operation(method = "list products", description = "products list query")
	@GetMapping(value = ConstantesGlobales.QUERY_LIST_PRODUCT)
	public ResponseEntity<?> listProduct() {
		return new ResponseEntity<>(this.productsService.listProduct(), HttpStatus.OK);
	}

	/**
	 * Expone el endpoint para guardar una categoria
	 * 
	 * @return esatus 200
	 * @parama entidad category
	 */
	@Operation(method = "save product", description = "save products")
	@PostMapping(value = ConstantesGlobales.SAVE_PRODUCT)
	public ResponseEntity<?> saveProduct(@RequestBody Products products) {
		return new ResponseEntity<>(this.productsService.saveProduct(products), HttpStatus.OK);
	}

	/**
	 * Expone el endpoint para actualizar una categoria
	 * 
	 * @return esatus 200
	 * @parama entidad category
	 */
	@Operation(method = "update product", description = "update products")
	@PutMapping(value = ConstantesGlobales.UPDATEP_RODUCT)
	public ResponseEntity<?> updateProduct(@RequestBody Products products) {
		return new ResponseEntity<>(this.productsService.updateProduct(products), HttpStatus.OK);
	}

	/**
	 * Expone el endpoint para eliminar una categoria
	 * 
	 * @return esatus 200 y un mensaje Registro Eliminado
	 * @parama entidad id (id categoria)
	 */
	@Operation(method = "delete product", description = "delete products")
	@DeleteMapping(value = ConstantesGlobales.DELETEP_RODUCT)
	public ResponseEntity<?> deleteProduct(@PathVariable int id) {
		this.productsService.deleteProduct(id);
		return ResponseEntity.ok("Registro Eliminado");
	}

}
