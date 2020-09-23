package oh29oh29.way01;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way01Runner implements ApplicationRunner {

    private final Way01Service way01Service;

    public Way01Runner(Way01Service way01Service) {
        this.way01Service = way01Service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String response = way01Service.get();
        System.out.println("## Way01 Response");
        System.out.println("data: " + response);
    }
}
