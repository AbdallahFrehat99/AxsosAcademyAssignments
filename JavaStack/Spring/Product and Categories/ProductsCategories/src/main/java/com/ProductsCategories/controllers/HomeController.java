package com.ProductsCategories.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ProductsCategories.models.Category;
import com.ProductsCategories.models.Product;
import com.ProductsCategories.services.CategoryService;
import com.ProductsCategories.services.ProductService;

@Controller

public class HomeController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;

	@GetMapping("")
	public String index(@ModelAttribute("category") Category category, @ModelAttribute("product") Product product,
			Model model) {
		List<Map<String, String>> items = new ArrayList<>();
		List<Product> products=productService.allProducts();
		List<Category> categories=categoryService.allCategories();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "index.jsp";
	}
}
