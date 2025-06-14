package com.ProductsCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductsCategories.models.Category;
import com.ProductsCategories.models.Product;
import com.ProductsCategories.repositories.CategoryRepository;

@Service
public class CategoryService {

	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
	public Category createCategory(Category c) {
        return categoryRepository.save(c);
    }
	
	public Category findCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
	public List<Category> findAllByProducts(Product product){
		return categoryRepository.findAllByProducts(product);
	}
	
	public List<Category> findByProductsNotContains(Product product){
		return categoryRepository.findByProductsNotContains(product);
	}
}
