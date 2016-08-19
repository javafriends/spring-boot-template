package br.com.cdeworks.sgp.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Principal principal, HttpServletRequest request) {
		
		if (principal == null || principal.getName() == null || principal.getName().equals("")) {
			return "/login";
		}
		String usuario = principal.getName();
		if (usuario != null) {
			request.getSession().setAttribute("usuarioLogado", usuario);
		}
		
		return "redirect:/membros";
	}

}
