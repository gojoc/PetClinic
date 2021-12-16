package udemy.spring.petclinic.service;

import udemy.spring.petclinic.model.Pet;

import java.util.UUID;

public interface PetService extends CrudService<Pet, UUID> {
}
