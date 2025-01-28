package com.products.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.entitys.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {


	
}
