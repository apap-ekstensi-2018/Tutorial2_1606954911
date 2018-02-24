package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PerkalianController {
	
	@RequestMapping("/perkalian")
	public String perkalian (@RequestParam(value = "a", required = false) Integer a, 
			@RequestParam(value = "b", required = false) Integer b, Model model) {
		int hasil;
		hasil=0;
		if (a == null && b == null) {
			a=0;
			b=0;
			
		}else if(a==null){
			a=0;
		}
		else if(b==null){
			b=0;
		}
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("hasil", a*b);
		return "perkalian";
	}

}
