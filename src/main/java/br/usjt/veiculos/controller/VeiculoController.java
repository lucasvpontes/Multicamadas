package br.usjt.veiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.veiculos.model.bean.Veiculo;
import br.usjt.veiculos.model.service.VeiculoService;

@Controller
public class VeiculoController {
	
	
//	@Autowired
//	private VeiculoRepository veiculosRepo;
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping("/veiculos")
	public ModelAndView listarVeiculos() {
		ModelAndView mv = new ModelAndView("lista_veiculos");
		mv.addObject(new Veiculo());
		List<Veiculo> veiculos = veiculoService.listarTodos();
		mv.addObject("veiculos", veiculos);
		return mv;
	}

	@PostMapping("/veiculos")
	public String salvar(Veiculo veiculo) {
		veiculoService.salvar(veiculo);
		return "redirect:/veiculos";
	}
}
