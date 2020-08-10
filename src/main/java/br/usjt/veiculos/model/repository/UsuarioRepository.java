package br.usjt.veiculos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.veiculos.model.bean.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
public Usuario findOneByLoginAndSenha (String login, String senha);
}

