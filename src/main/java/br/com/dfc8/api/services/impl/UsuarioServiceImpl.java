package br.com.dfc8.api.services.impl;

import br.com.dfc8.api.domain.Usuario;
import br.com.dfc8.api.repositories.UsuarioRepository;
import br.com.dfc8.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> obj= repository.findById(id);
        return obj.orElse(null);
    }
}