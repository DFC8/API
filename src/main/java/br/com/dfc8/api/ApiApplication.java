package br.com.dfc8.api;

import br.com.dfc8.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	User user = new User(1, "Darckson", "email.com.br", "1234");
}
