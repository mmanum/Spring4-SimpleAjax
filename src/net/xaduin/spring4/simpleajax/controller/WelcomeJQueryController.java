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
@RequestMapping("/jquery")
public class WelcomeJQueryController {


	@RequestMapping(value = {"index.html", "index.htm", "jquery"})
	public ModelAndView helloAjax() {
		ModelAndView mav = new ModelAndView("jquery-show_hide");
		return mav;
	}
}
