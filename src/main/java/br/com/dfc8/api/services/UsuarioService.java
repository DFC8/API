package br.com.dfc8.api.services;

import br.com.dfc8.api.domain.Usuario;
import br.com.dfc8.api.domain.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {

    Usuario findById(Integer id);
    List<Usuario> findAll();
    Usuario create(UsuarioDTO obj);
    Usuario update(UsuarioDTO obj);
}