package dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	 public String getTraining() {
	        return "Practice batting for 30 minutes";
	    }
	
}
