package com.axsosacademy.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsosacademy.mvc.models.Book;
import com.axsosacademy.mvc.services.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bookService;
    
    @RequestMapping("")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
	
	@RequestMapping("/{id}")
    public String show(@PathVariable("id") Long id,Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute(book);
        return "show.jsp";     
    }

	
	
}
