package springguru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springguru.petclinic.service.MasterOfAnimalServiceImpl;

@Controller
public class MasterOfAnimalController {

    private final MasterOfAnimalServiceImpl masterOfAnimalService;

    public MasterOfAnimalController(MasterOfAnimalServiceImpl masterOfAnimalService) {
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
