package br.com.fiap.universidade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.universidade.model.Discente;
import br.com.fiap.universidade.model.OpcoesNivel;
import br.com.fiap.universidade.model.OpcoesPaises;
import br.com.fiap.universidade.model.OpcoesStatus;
import br.com.fiap.universidade.model.Pessoa;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TesteController {
	
	@GetMapping("/teste")
	public String retornarPagina() {
		return "pagina";
	}

	
	@GetMapping("/transinfo1")
	public String transInfo(HttpServletRequest req) {
		req.setAttribute("var", "World");
		return "pagina";
	}
	
	@GetMapping("/transinfo2")
	public String transInfo2(Model model) {
		model.addAttribute("var","Brazil");
		return "pagina";
	}
	
	@GetMapping("/transinfo3")
	public ModelAndView transInfo3() {
		
		Pessoa p1 = new Pessoa( new Long(1), "fulano", "567.667.890-87", OpcoesPaises.BRASIL, 19 );
		Discente d1 = new Discente(new Long(1), "rm1234", p1, OpcoesStatus.ATIVO, OpcoesNivel.GRADUACAO);
		
		ModelAndView mv = new ModelAndView("pagina");
		mv.addObject("var", d1);
		
		return mv;
	}
		 
	
}
