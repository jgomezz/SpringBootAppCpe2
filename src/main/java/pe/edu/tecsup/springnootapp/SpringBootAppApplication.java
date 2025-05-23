package pe.edu.tecsup.springnootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.tecsup.springnootapp.beans.Calculadora;
import pe.edu.tecsup.springnootapp.beans.Saludo;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(SpringBootAppApplication.class);

	@Autowired
	private Calculadora calculadora ;

	@Qualifier("EN")
	@Autowired
	private Saludo saludo ;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("First application in Spring Boot");

		Double suma = this.calculadora.sumar(2.0,3.0);

		log.info(suma.toString());

		String nombre = "Jaime";

		log.info(this.saludo.dia(nombre));


	}
}
