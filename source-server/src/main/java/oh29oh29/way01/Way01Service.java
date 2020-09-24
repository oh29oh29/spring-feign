package oh29oh29.way01;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "way01", url = "http://localhost:8081")
public interface Way01Service {

    @GetMapping("/get")
    String get();

}