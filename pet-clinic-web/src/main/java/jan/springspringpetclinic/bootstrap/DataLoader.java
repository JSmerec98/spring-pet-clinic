package jan.springspringpetclinic.bootstrap;

import jan.springspringpetclinic.model.Owner;
import jan.springspringpetclinic.model.PetType;
import jan.springspringpetclinic.model.Vet;
import jan.springspringpetclinic.services.OwnerService;
import jan.springspringpetclinic.services.PetTypeService;
import jan.springspringpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Smith");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Gardner");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nick");
        vet2.setLastName("Jonas");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
