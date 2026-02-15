package dependencyinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Value("${coach.session}")
    private String session;

    @Override
    public String getTraining() {
        return "Football" + session;
    }
}
