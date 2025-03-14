package com.nimap.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.main.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
