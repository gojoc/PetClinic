package udemy.spring.petclinic.bootstrap;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.Owner;
import udemy.spring.petclinic.model.Pet;
import udemy.spring.petclinic.model.PetType;
import udemy.spring.petclinic.model.Speciality;
import udemy.spring.petclinic.model.Vet;
import udemy.spring.petclinic.service.OwnerService;
import udemy.spring.petclinic.service.PetService;
import udemy.spring.petclinic.service.PetTypeService;
import udemy.spring.petclinic.service.SpecialityService;
import udemy.spring.petclinic.service.VetService;

import java.time.LocalDate;

@Slf4j
@Component
@AllArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final PetTypeService petTypeService;
    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;
    private final SpecialityService specialityService;

    private void loadData() throws NullException {
        PetType firstPetType = PetType.builder()
                .name("Dog")
                .build();
        petTypeService.save(firstPetType);
        log.info("[DataLoader] saved firstPetType: {}", firstPetType);

        PetType secondPetType = PetType.builder()
                .name("Cat")
                .build();
        petTypeService.save(secondPetType);
        log.info("[DataLoader] saved secondPetType: {}", secondPetType);

        Owner firstOwner = Owner.builder()
                .firstName("Jane")
                .lastName("Austen")
                .address("Sunset Street 15")
                .city("New York")
                .telephone("7184396775")
                .build();
        ownerService.save(firstOwner);
        log.info("[DataLoader] saved first owner: {}", firstOwner);

        Owner secondOwner = Owner.builder()
                .firstName("David")
                .lastName("Bowen")
                .address("Hollywood Boulevard 20")
                .city("Los Angeles")
                .telephone("3374402899")
                .build();
        ownerService.save(secondOwner);
        log.info("[DataLoader] saved second owner: {}", secondOwner);

        Pet firstPet = Pet.builder()
                .name("Rosco")
                .birthDate(LocalDate.of(2020, 10, 15))
                .petType(firstPetType)
                .owner(firstOwner)
                .build();
        petService.save(firstPet);
        firstOwner.getPets().add(firstPet);
        log.info("[DataLoader] saved first pet: {}", firstPet);

        Pet secondPet = Pet.builder()
                .name("Luxor")
                .birthDate(LocalDate.of(2021, 2, 20))
                .petType(secondPetType)
                .owner(secondOwner)
                .build();
        petService.save(secondPet);
        secondOwner.getPets().add(secondPet);
        log.info("[DataLoader] saved second pet: {}", secondPet);

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

        Speciality firstSpeciality = Speciality.builder()
                .description("radiology")
                .build();
        specialityService.save(firstSpeciality);
        firstVet.getSpecialities().add(firstSpeciality);
        log.info("[DataLoader] saved first speciality: {}", firstSpeciality);

        Speciality secondSpeciality = Speciality.builder()
                .description("surgery")
                .build();
        specialityService.save(secondSpeciality);
        secondVet.getSpecialities().add(secondSpeciality);
        log.info("[DataLoader] saved second speciality: {}", secondSpeciality);
    }

    @Override
    public void run(String... arguments) throws NullException {
        if (petTypeService.findAll().isEmpty()) {
            loadData();
        }
    }
}
