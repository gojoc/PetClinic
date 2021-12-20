package udemy.spring.petclinic.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udemy.spring.petclinic.model.Owner;
import udemy.spring.petclinic.model.Vet;
import udemy.spring.petclinic.service.OwnerService;
import udemy.spring.petclinic.service.VetService;
import udemy.spring.petclinic.service.map.OwnerMapService;
import udemy.spring.petclinic.service.map.VetMapService;

import java.util.UUID;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... arguments) {
        Owner firstOwner = Owner.builder()
                .id(UUID.randomUUID())
                .firstName("Jane")
                .lastName("Austen")
                .build();
        ownerService.save(firstOwner);
        log.info("[DataLoader] saved first owner: {}", firstOwner);

        Owner secondOwner = Owner.builder()
                .id(UUID.randomUUID())
                .firstName("David")
                .lastName("Bowen")
                .build();
        ownerService.save(secondOwner);
        log.info("[DataLoader] saved second owner: {}", secondOwner);

        Vet firstVet = Vet.builder()
                .id(UUID.randomUUID())
                .firstName("Clara")
                .lastName("Johnson")
                .build();
        vetService.save(firstVet);
        log.info("[DataLoader] saved first vet: {}", firstVet);

        Vet secondVet = Vet.builder()
                .id(UUID.randomUUID())
                .firstName("Mark")
                .lastName("Smith")
                .build();
        vetService.save(secondVet);
        log.info("[DataLoader] saved second vet: {}", secondVet);
    }
}
