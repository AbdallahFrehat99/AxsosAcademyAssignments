package com.example.Date;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeTem {
	@RequestMapping("/time")
    public String timeTemplate(Model model) {
		String pattern = "h:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String time = simpleDateFormat.format(new java.util.Date());
		model.addAttribute("time",time);
        return "time.jsp";
    }
}
