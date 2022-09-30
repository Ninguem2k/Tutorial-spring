package br.tutorial.spring.aplicacaospring.basico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AplicacaoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AplicacaoSpringApplication.class, args);
		ClassA objetoA = applicationContext.getBean(ClassA.class);
		objetoA.execute();
	}

}
