package springguru.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterenarController {

    @RequestMapping({"/veterenar/index","/veterenar","/veterenar/index.html "})
    public String listOfVeterenarov(){
        return "veterenar/index";
    }

}
