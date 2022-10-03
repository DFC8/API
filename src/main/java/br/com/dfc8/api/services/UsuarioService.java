package br.com.dfc8.api.services;

import br.com.dfc8.api.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario findById(Integer id);
    List<Usuario> findAll();
}
