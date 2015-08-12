package net.xaduin.spring4.simpleajax.controller;

import java.util.Random;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ajax")
public class WelcomeAjaxController {


	@RequestMapping(value = {"index.html", "index.htm", "time"})
	public ModelAndView helloAjax() { 
		
		String message = "Xaduin Spring MVC with Ajax and JQuery Demo...";
		ModelAndView mav = new ModelAndView("ajax", "message", message);
		return mav;
	}


	@RequestMapping(value ="ajaxtest.html", method = RequestMethod.GET)
	public @ResponseBody String getTime() { 
		
		Random rand = new Random();
		float r = rand.nextFloat() * 100;
		String result = "<br>Next Random # is <b>" + r + "</b>. Generated on <b>" + new Date().toString() + "</b>";
		System.out.println("Debug Message from AjaxjQuery Controller..." + new Date().toString());
		return result;
	}
}
