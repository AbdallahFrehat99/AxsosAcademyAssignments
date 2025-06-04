package com.example.dojoNinja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dojoNinja.models.Dojo;
import com.example.dojoNinja.models.Ninja;
import com.example.dojoNinja.services.DojoService;
import com.example.dojoNinja.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoNinjaController {
	@Autowired
	NinjaService ninjaService;
	
	@Autowired
	DojoService dojoService;
	
	
    @GetMapping("")
    public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
        model.addAttribute("dojos", dojoService.allDojos());
        return "index.jsp";
    }
	
	
	
	@PostMapping("/dojos/new")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.allDojos());
            return "index.jsp";
        } else {
        	dojoService.createDojo(dojo);
            return "redirect:/";
        }
	}
	
	
	 @GetMapping("/ninjas/new")
	    public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
	        model.addAttribute("dojos", dojoService.allDojos());
	        return "newNinja.jsp";
	    }
	
	 @PostMapping("/ninja/create")
		public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
			if (result.hasErrors()) {
	            return "newNinja.jsp";
	        } else {
	        	ninjaService.createNinja(ninja);
	            return "redirect:/";
	        }
		}
	 
	 @RequestMapping("/dojos/{id}")
	 	public String ninjas(@PathVariable("id") Long id, Model model) {
		 	Dojo dojo=dojoService.findDojo(id);
		 	model.addAttribute("dojo",dojo);
//		 	List<Ninja> ninja=ninjaService.findNinja();
//		 	model.addAttribute("ninjas",ninja);

		 	return "ninjas.jsp";
	 }
	
	
	
	
}
