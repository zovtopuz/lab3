package ua.lviv.iot.Auto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.Auto.Manager.AutoRepository;




@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}
	
	
	 @Bean
	    public CommandLineRunner demo(final AutoRepository repository) {
	        return (args) -> {
	        	repository.save( new Auto("White", "21", 19572, "2010"));
	            
};

}
	 }