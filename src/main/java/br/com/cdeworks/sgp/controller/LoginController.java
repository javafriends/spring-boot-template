package br.com.cdeworks.sgp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String form() {
		return "/login";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login() {
		return "/membros";
	}

}
