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
public class ProductController {

	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;

	@GetMapping("/products/new")
	public String renderProducts(@ModelAttribute("product") Product product, Model model) {
		return "newProduct.jsp";
	}

	@PostMapping("/products/add")
	public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {

			return "newProduct.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/";
		}
	}

	@GetMapping("/products/{id}")
	public String renderProduct(@PathVariable("id") Long id, Model model) {
		Product product = productService.findProduct(id);
		List<Category> categories = categoryService.findAllByProducts(product);
		List<Category> restCategories=categoryService.findByProductsNotContains(product);
		model.addAttribute("product", product);
		model.addAttribute("categories", categories);
		model.addAttribute("restCategories", restCategories);

		return "infoProduct.jsp";
	}

	@PostMapping("/addCategory/{pId}")
	public String addCategory(@PathVariable("pId") Long id, @RequestParam(value = "category") Long categoryId,Model model) {
		Category category = categoryService.findCategory(categoryId);

		Product product = productService.findProduct(id);
			category.getProducts().add(product);
			categoryService.createCategory(category);

			return "redirect:/products/" + id;

	}

}
