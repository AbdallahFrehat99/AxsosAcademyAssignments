package com.example.Fruits;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Fruit {
	 @RequestMapping("/")
	    public String index(Model model) {
		 	ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("Kiwi", 1.5));
	        fruits.add(new Item("Mango", 2.0));
	        fruits.add(new Item("Goji Berries", 4.0));
	        fruits.add(new Item("Guava", .75));
	        fruits.add(new Item("Banana", 1.75));
	        fruits.add(new Item("Apple", 2.75));
	        fruits.add(new Item("Strawberry", 3.75));       
	        fruits.add(new Item("pomegranate", 4.75));
	        fruits.add(new Item("Dragon Fruit", 5.75));
	        fruits.add(new Item("Peach", 6.75));
	        fruits.add(new Item("Orange", 7.75));

	        
	        model.addAttribute("menu", fruits);
	        return "index.jsp";
	    }
}
