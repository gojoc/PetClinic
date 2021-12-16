package udemy.spring.petclinic.service;

import udemy.spring.petclinic.model.Owner;

import java.util.UUID;

public interface OwnerService extends CrudService<Owner, UUID> {
    Owner findByLastName(String lastName);
}
