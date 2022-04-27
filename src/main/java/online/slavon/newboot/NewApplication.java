package online.slavon.newboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NewApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewApplication.class, args );
	}
	@Bean
	public CommandLineRunner runner(ClientRepository clientRepository) {
		return new CommandLineRunner(){

			@Override
			public void run(String... args) throws Exception {
				for (int i=0; i<20; i++) {
					Client c = new Client("Name"+i, "Name"+i+"@gmail.com");
					clientRepository.save(c);
				}
			}
		};
	}



}
