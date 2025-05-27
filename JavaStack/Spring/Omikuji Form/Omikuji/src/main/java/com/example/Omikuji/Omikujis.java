package com.example.Omikuji;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/omikuji")
public class Omikujis {

	@RequestMapping("")
    public String index() {
		
        return "index.jsp";
    }
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
    public String process(@RequestParam(value="number") String number,
    	    @RequestParam(value="city") String city ,
    		@RequestParam(value="person") String person,
			@RequestParam(value="endeavor") String endeavor,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="nice") String nice,HttpSession session){
		
		session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("endeavor", endeavor);
        session.setAttribute("thing", thing);
        session.setAttribute("nice", nice);
        
        return "redirect:/omikuji/show";
    }
	
	@RequestMapping("/show")
	public String show() {
	    
		return "show.jsp";
	}
}
