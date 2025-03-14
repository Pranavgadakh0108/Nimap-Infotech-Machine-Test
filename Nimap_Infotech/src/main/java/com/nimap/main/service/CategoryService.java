package com.nimap.main.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.nimap.main.entity.Category;

public interface CategoryService {

	// GET - all the categories
	public Page<Category> getAllCategories(Pageable pageable);

	// GET - category by Id
	public Optional<Category> getCategoryById(Long id);

	// POST - create a new category
	public Category createCategory(Category category);

	// PUT - update category by id
	public ResponseEntity<?> updateCategory(Long id, Category categoryDetails);

	// DELETE - Delete category by id
	public void deleteCategory(Long id);

}
