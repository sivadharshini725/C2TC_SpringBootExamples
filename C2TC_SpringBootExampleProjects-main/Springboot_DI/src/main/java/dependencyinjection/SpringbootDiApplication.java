package dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDiApplication implements CommandLineRunner{
	
	
	@Autowired
    private Coach cricketCoach;

    @Autowired
    private Coach footballCoach;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDiApplication.class, args);
		
		
	}
	
	 public void run(String... args) {
	        System.out.println(cricketCoach.getTraining());
	        System.out.println(footballCoach.getTraining());
	    }

}
