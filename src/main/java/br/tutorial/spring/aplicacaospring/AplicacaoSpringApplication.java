package br.tutorial.spring.aplicacaospring;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicacaoSpringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(AplicacaoSpringApplication.class, args);
		ClassA objetoA = new ClassA(new ClassY());
		objetoA.execute();
	}

}
