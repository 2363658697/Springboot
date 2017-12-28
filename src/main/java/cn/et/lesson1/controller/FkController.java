package cn.et.lesson1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FkController {
	
	@RequestMapping("/f")
	public String test(){
		
		return "fw";
	}
	
}
