package udemy.spring.petclinic.service;

import udemy.spring.petclinic.model.Vet;

import java.util.Set;
import java.util.UUID;

public interface VetService {
    Vet findById(UUID id);

    Vet findByLastName(String lastName);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
