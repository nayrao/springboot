package in.rajait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("in.rajait.controller")
@ComponentScan({"in.rajait","in.rajait.model","in.rajait.repository","in.rajait.service"})
public class PhoneBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication.class, args);
	}

}
