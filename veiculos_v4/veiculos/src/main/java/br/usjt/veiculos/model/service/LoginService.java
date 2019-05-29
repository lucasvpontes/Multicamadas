package br.usjt.veiculos.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.veiculos.model.bean.Usuario;
import br.usjt.veiculos.model.repository.UsuarioRepository;

@Service
public class LoginService {
@Autowired
UsuarioRepository usuarioRepo;
public boolean logar (Usuario usuario) {
return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
 usuario.getSenha()) != null;
}
}