package com.nimap.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nimap.main.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
