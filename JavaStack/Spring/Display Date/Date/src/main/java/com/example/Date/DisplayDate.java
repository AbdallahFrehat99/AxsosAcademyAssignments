package com.example.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DisplayDate {
	 @RequestMapping("/")
	    public String index(Model model) {

	        return "index.jsp";
	    }
}
