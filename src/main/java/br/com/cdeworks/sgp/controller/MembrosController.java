package br.com.cdeworks.sgp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cdeworks.sgp.entity.model.Membro;
import br.com.cdeworks.sgp.entity.repository.MembroRepository;

@Controller
@RequestMapping(value="/membros")
public class MembrosController {
	
	@Autowired
	private MembroRepository repository;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar() {
		
		return new ModelAndView("/pages/membros/form");
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(Membro membro, RedirectAttributes ra) {
		repository.save(membro);
		ra.addFlashAttribute("mensagem", "Membro salvo com sucesso!");
		ModelAndView mv = new ModelAndView("redirect:/membros");
		return mv;
	}

}
