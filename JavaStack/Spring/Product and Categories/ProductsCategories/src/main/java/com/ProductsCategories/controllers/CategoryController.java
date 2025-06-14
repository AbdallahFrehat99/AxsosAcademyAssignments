package com.ProductsCategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ProductsCategories.models.Category;
import com.ProductsCategories.models.Product;
import com.ProductsCategories.services.CategoryService;
import com.ProductsCategories.services.ProductService;

import jakarta.validation.Valid;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	@GetMapping("/categories/new")
	public String renderCategory( @ModelAttribute("category") Category category,Model model) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/categories/add")
	public String create(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			
            return "newCategory.jsp";
        } else {
        	categoryService.createCategory(category);
            return "redirect:/";
        }
	}
	
	@GetMapping("/categories/{id}")
	public String renderCategory(@PathVariable("id") Long id,Model model) {
		Category category=categoryService.findCategory(id);
		List<Product> products=productService.findAllByCategories(category);
		List<Product> restProducts=productService.findByCategoriesNotContains(category);
	 	model.addAttribute("category",category);
	 	model.addAttribute("products",products);
	 	model.addAttribute("restProducts", restProducts);
		return "infoCategory.jsp";
	}
	
	@PostMapping("/addProduct/{categoryId}")
	public String addProduct(@PathVariable("categoryId") Long id, @RequestParam(value ="product") Long pId) {
		Category category=categoryService.findCategory(id);

		Product product = productService.findProduct(pId);

		category.getProducts().add(product);
		categoryService.createCategory(category);
		
		return "redirect:/categories/"+id;
	}
	
}
