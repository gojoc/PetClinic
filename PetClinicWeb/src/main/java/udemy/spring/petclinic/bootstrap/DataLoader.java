package udemy.spring.petclinic.bootstrap;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.Owner;
import udemy.spring.petclinic.model.PetType;
import udemy.spring.petclinic.model.Vet;
import udemy.spring.petclinic.service.OwnerService;
import udemy.spring.petclinic.service.PetTypeService;
import udemy.spring.petclinic.service.VetService;

@Slf4j
@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final PetTypeService petTypeService;
    private final OwnerService ownerService;
    private final VetService vetService;

    @Override
    public void run(String... arguments) throws NullException {
        PetType firstPetType = PetType.builder()
                .name("Dog")
                .build();
        PetType firstSavedPetType = petTypeService.save(firstPetType);
        log.info("[DataLoader] saved firstPetType: {}", firstSavedPetType);

        PetType secondPetType = PetType.builder()
                .name("Cat")
                .build();
        PetType secondSavedPetType = petTypeService.save(secondPetType);
        log.info("[DataLoader] saved secondPetType: {}", secondSavedPetType);

        Owner firstOwner = Owner.builder()
                .firstName("Jane")
                .lastName("Austen")
                .build();
        ownerService.save(firstOwner);
        log.info("[DataLoader] saved first owner: {}", firstOwner);

        Owner secondOwner = Owner.builder()
                .firstName("David")
                .lastName("Bowen")
                .build();
        ownerService.save(secondOwner);
        log.info("[DataLoader] saved second owner: {}", secondOwner);

        Vet firstVet = Vet.builder()
                .firstName("Clara")
                .lastName("Johnson")
                .build();
        vetService.save(firstVet);
        log.info("[DataLoader] saved first vet: {}", firstVet);

        Vet secondVet = Vet.builder()
                .firstName("Mark")
                .lastName("Smith")
                .build();
        vetService.save(secondVet);
        log.info("[DataLoader] saved second vet: {}", secondVet);
    }
}
