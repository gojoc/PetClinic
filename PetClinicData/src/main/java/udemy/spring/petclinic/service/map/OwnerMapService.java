package udemy.spring.petclinic.service.map;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.Owner;
import udemy.spring.petclinic.model.Pet;
import udemy.spring.petclinic.model.PetType;
import udemy.spring.petclinic.service.OwnerService;
import udemy.spring.petclinic.service.PetService;
import udemy.spring.petclinic.service.PetTypeService;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@Service
public class OwnerMapService extends AbstractMapService<Owner, UUID> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(UUID id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return map.values()
                .stream()
                .filter(owner -> owner.getLastName().equals(lastName))
                .findAny()
                .orElse(null);
    }

    @Override
    public Owner save(Owner owner) throws NullException {
        if (owner == null) {
            throw new NullException("Owner cannot be null.");
        }
        Set<Pet> pets = owner.getPets();
        if (pets != null) {
            for (Pet pet : pets) {
                PetType petType = pet.getPetType();
                if (petType == null) {
                    throw new NullException("Pet type cannot be null.");
                }
                if (petType.getId() == null) {
                    pet.setPetType(petTypeService.save(petType));
                }
                if (pet.getId() == null) {
                    pet.setId(petService.save(pet).getId());
                }
            }
        }
        return super.save(owner);
    }

    @Override
    public void deleteById(UUID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
