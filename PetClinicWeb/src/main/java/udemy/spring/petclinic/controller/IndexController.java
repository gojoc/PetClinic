package udemy.spring.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"", "/", "index", "index.html"})
    public String getIndex() {
        return "index";
    }

    @GetMapping("oups")
    public String getError() {
        return "not_implemented";
    }
}
