package jan.springspringpetclinic.model.bootstrap;

import jan.springspringpetclinic.model.Owner;
import jan.springspringpetclinic.model.Vet;
import jan.springspringpetclinic.services.OwnerService;
import jan.springspringpetclinic.services.VetService;
import jan.springspringpetclinic.services.map.OwnerServiceMap;
import jan.springspringpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Smith");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Gardner");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Nick");
        vet2.setLastName("Jonas");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
