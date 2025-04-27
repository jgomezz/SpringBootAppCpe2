package pe.edu.tecsup.springnootapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {

	private static Logger log = LoggerFactory.getLogger(SpringBootAppApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("First application in Spring Boot");
	}
}
