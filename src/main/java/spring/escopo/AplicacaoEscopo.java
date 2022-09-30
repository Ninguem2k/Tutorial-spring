package spring.escopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AplicacaoEscopo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AplicacaoEscopo.class, args);
		ClassDAO objetDao1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Obejto DAO - " + objetDao1);
		System.out.println("Obejto JDBC - " + objetDao1.getOClassjdba());
	}

}
