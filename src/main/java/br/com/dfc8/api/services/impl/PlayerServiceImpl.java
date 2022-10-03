package br.com.dfc8.api.services.impl;

import br.com.dfc8.api.domain.Player;
import br.com.dfc8.api.domain.dto.PlayerDTO;
import br.com.dfc8.api.repositories.PlayerRepository;
import br.com.dfc8.api.services.PlayerService;
import br.com.dfc8.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Player findById(Integer id) {
        Optional<Player> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Player> findAll() {
        return repository.findAll();
    }

    @Override
    public Player create(PlayerDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Player.class));
    }

    @Override
    public Player update(PlayerDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Player.class));
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    private void findByEmail(PlayerDTO obj) {
        Optional<Player> usuario = repository.findByEmail(obj.getEmail());
        if (usuario.isPresent() && usuario.get().getId().equals(obj.getId())) {
            throw new ObjectNotFoundException("E-mail já cadastrado no sistema");
        }
    }
}
