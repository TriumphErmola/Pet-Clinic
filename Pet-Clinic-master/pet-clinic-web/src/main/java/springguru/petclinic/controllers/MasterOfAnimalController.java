package springguru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/masterOfAnimal")
@Controller
public class MasterOfAnimalController {

    @RequestMapping({"","/index","/","/index.html "})
    public String masterOfAnimalList(){
        return "masterOfAnimal/index";
    }

}
