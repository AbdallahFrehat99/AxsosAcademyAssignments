package com.example.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

@RestController
public class HelloHuman {
	public static void main(String[] args) {
		SpringApplication.run(HelloHuman.class, args);
		
	}

	@RequestMapping("/")
    public String index(@RequestParam(value="q" , required = false) String name ,@RequestParam(value="qq" , required = false) String lastName,@RequestParam(value="qqq" , required = false) String times) { 
        if(name !=null && lastName==null&& times==null){    
		return "Hello " + name;
        }else if(name !=null && lastName !=null && times==null) {
        	return "Hello " + name +" "+lastName;
        }else if(name !=null &&lastName ==null && times!=null) {
        	int count = Integer.parseInt(times);
        	String subhi="";
        	for (int i =0;i<count;i++) {
        		subhi+=(i+1)+" Hello "+name+" ";
        	}
        	return subhi;
        }
        else {
        	return "Hello human";
        }
    }

    }

