package eu.jgabriel.tarefasapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TarefasAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TarefasAppApiApplication.class, args);
	}

	@GetMapping("/healthcheck")
	public String healthcheck(){
		return "Ok";
	}

}
