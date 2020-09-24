package oh29oh29.way02;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "way02", url = "http://localhost:8081", configuration = FeignClientsConfiguration.class)
public interface Way02Service {

    @GetMapping("/get")
    String get();

}