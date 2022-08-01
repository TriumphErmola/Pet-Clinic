package springguru.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springguru.petclinic.model.MasterOfAnimal;
import springguru.petclinic.model.Veterenar;
import springguru.petclinic.service.MasterOfAnimalServiceImpl;
import springguru.petclinic.service.VeterenarServiceImpl;
import springguru.petclinic.service.map.MasterOfAnimalServiceMap;
import springguru.petclinic.service.map.VeterenarServiceMap;

@Component
public class DataItializer implements CommandLineRunner {

    private final MasterOfAnimalServiceImpl masterOfAnimalService;
    private final VeterenarServiceImpl veterenarService;


    public DataItializer() {
        masterOfAnimalService = new MasterOfAnimalServiceMap();
        veterenarService = new VeterenarServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        MasterOfAnimal masterOfAnimal1 = new MasterOfAnimal();
        masterOfAnimal1.setFirstName("Andrey");
        masterOfAnimal1.setSecondName("Ermolenko");

        masterOfAnimalService.save(masterOfAnimal1);

        MasterOfAnimal masterOfAnimal2 = new MasterOfAnimal();
        masterOfAnimal2.setFirstName("Pal");
        masterOfAnimal2.setSecondName("Palich");

        masterOfAnimalService.save(masterOfAnimal2);

        System.out.println("Loaded MasterOfAnimals");

        Veterenar veterenar1 = new Veterenar();
        veterenar1.setFirstName("John");
        veterenar1.setSecondName("Wick");

        veterenarService.save(veterenar1);

        Veterenar veterenar2 = new Veterenar();
        veterenar2.setFirstName("Bob");
        veterenar2.setSecondName("Dallos");

        veterenarService.save(veterenar2);

        System.out.println("Loaded Veterenars");


    }
}
