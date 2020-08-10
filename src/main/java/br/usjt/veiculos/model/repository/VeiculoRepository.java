package br.usjt.veiculos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import	br.usjt.veiculos.model.bean.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
}

