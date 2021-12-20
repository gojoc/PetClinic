package udemy.spring.petclinic.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import udemy.spring.petclinic.service.OwnerService;

@Controller
@RequestMapping("owners")
@AllArgsConstructor
public class OwnerController {
    private final OwnerService ownerService;

    @GetMapping({"", "/", "index", "index.html"})
    public String getOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
