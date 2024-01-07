package eu.jgabriel.tarefasapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TarefasAppApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testHealtcheckReturn(){
		TarefasAppApiApplication api = new TarefasAppApiApplication();
		Assertions.assertEquals("Ok", api.healthcheck());
	}
}
