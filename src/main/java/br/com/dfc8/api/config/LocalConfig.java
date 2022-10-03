package br.com.dfc8.api.config;

import br.com.dfc8.api.domain.Player;
import br.com.dfc8.api.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private PlayerRepository repository;

    @Bean
    public void startDB() {
    Player u1 = new Player(null, "Darckson", "dfc@gamil.com", "123");
    Player u2 = new Player(null, "Ana", "ana@gamil.com", "123");

    repository.saveAll(List.of(u1, u2));
    }


}
