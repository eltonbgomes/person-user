package manager.user.personApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1/person")
public class PersonController {

    @GetMapping
    public String getBook(){
        return "API test";
    }
}
