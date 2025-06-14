package com.ProductsCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductsCategories.models.Category;
import com.ProductsCategories.models.Product;
import com.ProductsCategories.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> allProducts() {
        return productRepository.findAll();
    }
	public Product createProduct(Product p) {
        return productRepository.save(p);
    }
	
	public Product findProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }
	public List<Product> findAllByCategories(Category category){
		return productRepository.findAllByCategories(category);
	}
	
	public List<Product> findByCategoriesNotContains(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
}
