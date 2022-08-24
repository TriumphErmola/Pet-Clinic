package springguru.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springguru.petclinic.model.*;
import springguru.petclinic.service.MasterOfAnimalService;
import springguru.petclinic.service.SpecialtyService;
import springguru.petclinic.service.TypeAnimalService;
import springguru.petclinic.service.VeterenarService;

import java.time.LocalDate;

@Component
public class DataItializer implements CommandLineRunner {

    private final MasterOfAnimalService masterOfAnimalService;
    private final VeterenarService veterenarService;
    private final TypeAnimalService typeAnimalService;
    private final SpecialtyService specialtyService;


    public DataItializer(MasterOfAnimalService masterOfAnimalService, VeterenarService veterenarService, TypeAnimalService typeAnimalService,
                         SpecialtyService specialtyService) {
        this.masterOfAnimalService = masterOfAnimalService;
        this.veterenarService = veterenarService;
        this.typeAnimalService = typeAnimalService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = typeAnimalService.findAll().size();

        if(count == 0){
            loadData();
        }
    }

    private void loadData() {
        TypeAnimal dog = new TypeAnimal();
        dog.setTypeName("Dog");
        typeAnimalService.save(dog);
        System.out.println("Loaded TypeAnimal Dog");

        TypeAnimal cat = new TypeAnimal();
        dog.setTypeName("Cat");
        typeAnimalService.save(cat);
        System.out.println("Loaded TypeAnimal Cat");

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");

        specialtyService.save(radiology);
        specialtyService.save(surgery);
        specialtyService.save(dentistry);

        System.out.println("Loaded Specialtys");

        MasterOfAnimal masterOfAnimal1 = new MasterOfAnimal();
        masterOfAnimal1.setFirstName("Andrey");
        masterOfAnimal1.setSecondName("Ermolenko");
        masterOfAnimal1.setAddres("Chimokov 32");
        masterOfAnimal1.setCity("Omsk");
        masterOfAnimal1.setTelephone("79293606910");

        masterOfAnimalService.save(masterOfAnimal1);

        MasterOfAnimal masterOfAnimal2 = new MasterOfAnimal();
        masterOfAnimal2.setFirstName("Pal");
        masterOfAnimal2.setSecondName("Palich");
        masterOfAnimal2.setAddres("Prospect Mira 72");
        masterOfAnimal2.setCity("Tobolsk");
        masterOfAnimal2.setTelephone("79131431287");

        masterOfAnimalService.save(masterOfAnimal2);

        System.out.println("Loaded MasterOfAnimals");

        HomeAnimal kisilychik = new HomeAnimal();
        kisilychik.setName("kisilychik");
        kisilychik.setTypeAnimal(cat);
        kisilychik.setMasterOfAnimal(masterOfAnimal1);
        kisilychik.setBirthday(LocalDate.now());

        HomeAnimal muhtar = new HomeAnimal();
        muhtar.setName("Muhtar");
        muhtar.setTypeAnimal(dog);
        muhtar.setMasterOfAnimal(masterOfAnimal2);
        muhtar.setBirthday(LocalDate.now());

        masterOfAnimal1.getHomeAnimalSet().add(kisilychik);
        masterOfAnimal2.getHomeAnimalSet().add(muhtar);

        Veterenar veterenar1 = new Veterenar();
        veterenar1.setFirstName("John");
        veterenar1.setSecondName("Wick");
        veterenar1.getSpecialtySet().add(radiology);

        veterenarService.save(veterenar1);

        Veterenar veterenar2 = new Veterenar();
        veterenar2.setFirstName("Bob");
        veterenar2.setSecondName("Dallos");
        veterenar2.getSpecialtySet().add(radiology);

        veterenarService.save(veterenar2);

        System.out.println("Loaded Veterenars");
    }
}
