package net.xaduin.spring4.simpleajax.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SimpleAjaxController {
	
	@PostConstruct
	public void showInit() {
	   System.out.println("bean " + this.getClass().getName() + " initialized");
	}
	

	@RequestMapping(value = { "index.html", "index.htm", "welcome" })
	public ModelAndView welcome() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		ModelAndView mav = new ModelAndView("welcome", "message", message);
		mav.addObject("mapping", "@RequestMapping('/index.htm')");
		return mav;
	}

	@RequestMapping("hi")
	public ModelAndView hi() { 
		
		return new ModelAndView("hi");
	}

}
