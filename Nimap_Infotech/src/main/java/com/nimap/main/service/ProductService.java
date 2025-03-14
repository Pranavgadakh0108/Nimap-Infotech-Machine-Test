package com.nimap.main.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.nimap.main.entity.Product;

public interface ProductService {
	
	//GET- all the products
	public Page<Product> getAllProducts(Pageable pageable);
	
	//GET - product by Id
	public Optional<Product> getProductById(Long id);
	
	//POST - create a new product
	public Product createProduct(Product product);
	
	//PUT - update product by id
	public ResponseEntity<?> updateProduct(Long id, Product productDetails);
	
	//DELETE - Delete product by id
	public void deleteProduct(Long id);

}
