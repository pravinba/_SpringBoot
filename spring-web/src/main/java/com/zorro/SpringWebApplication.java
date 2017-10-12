package com.zorro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringWebApplication {

	//@Autowired
	//private Avengers avengers;
	
	@RequestMapping("/mustache")
	public String mustache(Model model){
		model.addAttribute("company","Oreilly");
		return "template";
	}
	
	@RequestMapping("/viewresolver")
	public String viewResolver(){
		return "viewresolver";
	}
	
	
	
	@ResponseBody
	@RequestMapping("/avengers")
	public Avengers avengers(){
		return new Avengers(new String[]{"Ironman","Hulk","Blackwidow"});
	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebApplication.class, args);
	}
}
