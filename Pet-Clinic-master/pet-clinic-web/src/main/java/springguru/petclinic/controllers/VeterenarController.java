package springguru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springguru.petclinic.service.VeterenarService;

@Controller
public class VeterenarController {

    private final VeterenarService veterenarService;

    public VeterenarController(VeterenarService veterenarService) {
        this.veterenarService = veterenarService;
    }

    @RequestMapping({"/veterenar/index","/veterenar","/veterenar/index.html "})
    public String listOfVeterenarov(Model model){
        model.addAttribute("veterenar",veterenarService.findAll());

        return "veterenar/index";
    }

}
