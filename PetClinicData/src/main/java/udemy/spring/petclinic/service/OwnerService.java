package udemy.spring.petclinic.service;

import udemy.spring.petclinic.model.Owner;

import java.util.Set;
import java.util.UUID;

public interface OwnerService {
    Owner findById(UUID id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
