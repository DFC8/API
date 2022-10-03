package br.com.dfc8.api.services.impl;

import br.com.dfc8.api.domain.Usuario;
import br.com.dfc8.api.domain.dto.UsuarioDTO;
import br.com.dfc8.api.repositories.UsuarioRepository;
import br.com.dfc8.api.services.UsuarioService;
import br.com.dfc8.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Usuario create(UsuarioDTO obj) {
        return repository.save(mapper.map(obj, Usuario.class));
    }
}
