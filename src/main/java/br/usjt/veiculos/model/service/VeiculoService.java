package br.usjt.veiculos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.veiculos.model.bean.Veiculo;
import br.usjt.veiculos.model.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculosRepo;
	
	public void salvar (Veiculo veiculo) {
		veiculosRepo.save(veiculo);
	}
	
	public List <Veiculo> listarTodos(){
		return veiculosRepo.findAll();
	}
}
