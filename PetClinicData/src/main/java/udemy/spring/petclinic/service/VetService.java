package udemy.spring.petclinic.service;

import udemy.spring.petclinic.model.Vet;

import java.util.UUID;

public interface VetService extends CrudService<Vet, UUID> {
    Vet findByLastName(String lastName);
}
