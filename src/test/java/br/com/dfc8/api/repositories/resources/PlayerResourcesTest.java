package br.com.dfc8.api.repositories.resources;

import br.com.dfc8.api.domain.Player;
import br.com.dfc8.api.domain.dto.PlayerDTO;
import br.com.dfc8.api.services.impl.PlayerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlayerResourcesTest {

    public static final Integer ID = 1;
    public static final Integer INDEX = 0;
    public static final String NAME = "Valdir";
    public static final String EMAIL = "valdir@gmail.com";
    public static final String PASSWORD = "123";

    private Player player;
    private PlayerDTO playerDTO;

    @InjectMocks
    private PlayerResources resources;

    @Mock
    private PlayerServiceImpl service;

    @Mock
    private ModelMapper mapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startPlayer();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startPlayer() {
        player = new Player(ID, NAME, EMAIL, PASSWORD);
        playerDTO = new PlayerDTO(ID, NAME, EMAIL, PASSWORD);
    }
}