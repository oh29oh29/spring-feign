package oh29oh29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @GetMapping("/get")
    public String get() {
        return "get";
    }

}
