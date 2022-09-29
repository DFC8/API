package br.com.dfc8.api.config;

import br.com.dfc8.api.domain.Usuario;
import br.com.dfc8.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UsuarioRepository repository;

    @Bean
    public void startDB() {
    Usuario u1 = new Usuario(null, "Darckson", "dfc@gamil.com", "123");
    Usuario u2 = new Usuario(null, "Ana", "ana@gamil.com", "123");

    repository.saveAll(List.of(u1, u2));
    }


}
