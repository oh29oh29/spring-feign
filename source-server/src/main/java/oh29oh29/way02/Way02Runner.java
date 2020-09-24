package oh29oh29.way02;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Way02Runner implements ApplicationRunner {

    private final Way02Service way02Service;

    public Way02Runner(Way02Service way02Service) {
        this.way02Service = way02Service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String response = way02Service.get();
        System.out.println("## Way02 Response");
        System.out.println("data: " + response);
    }
}
