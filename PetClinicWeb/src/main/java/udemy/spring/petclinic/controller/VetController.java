package udemy.spring.petclinic.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import udemy.spring.petclinic.service.VetService;

@Controller
@RequestMapping("vets")
@AllArgsConstructor
public class VetController {
    private final VetService vetService;

    @GetMapping({"", "/", "index", "index.html"})
    public String getOwners(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}
