package br.com.dfc8.api.services;

import br.com.dfc8.api.domain.Player;
import br.com.dfc8.api.domain.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {

    Player findById(Integer id);
    List<Player> findAll();
    Player create(PlayerDTO obj);
    Player update(PlayerDTO obj);
    void delete(Integer id);
}