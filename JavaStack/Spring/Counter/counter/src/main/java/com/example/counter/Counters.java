package com.example.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller

public class Counters {
	 @RequestMapping("/")
	    public String index(HttpSession session) {
		 session.setAttribute("name", "Abdallah");

		 if (session.getAttribute("count") == null) {
			 session.setAttribute("count", 0);
		 }
		 else {
			 int count = (int)session.getAttribute("count");
			 count++;
			 session.setAttribute("count", count);
		 }
		 
	        return "index.jsp";
	    }
	 @RequestMapping("/counter")

	 	public String count(HttpSession session) {
		 if (session.getAttribute("count") == null) {
			 session.setAttribute("count", 0);
		 }
	        return "count.jsp";
	    }
	 
}
