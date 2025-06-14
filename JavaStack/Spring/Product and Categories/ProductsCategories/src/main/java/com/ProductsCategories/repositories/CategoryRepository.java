package com.ProductsCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ProductsCategories.models.Category;
import com.ProductsCategories.models.Product;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

	
    List<Category> findAll();
    List<Category> findAllByProducts(Product product);
    List<Category> findByProductsNotContains(Product product);


}
