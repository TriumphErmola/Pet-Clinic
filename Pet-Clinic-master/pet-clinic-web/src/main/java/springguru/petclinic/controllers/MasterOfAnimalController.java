package springguru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springguru.petclinic.service.MasterOfAnimalService;

@Controller
public class MasterOfAnimalController {

    private final MasterOfAnimalService masterOfAnimalService;

    public MasterOfAnimalController(MasterOfAnimalService masterOfAnimalService) {
        this.masterOfAnimalService = masterOfAnimalService;
    }

    @RequestMapping({"/masterOfAnimals"})
    public String masterOfAnimalList(Model model){
        model.addAttribute("masterOfAnimals",masterOfAnimalService.findAll());
        return "masterOfAnimals/index";
    }

    @RequestMapping("/find")
    public String findMasterOfAnimal(){
        return "notimplemented";
    }

}
