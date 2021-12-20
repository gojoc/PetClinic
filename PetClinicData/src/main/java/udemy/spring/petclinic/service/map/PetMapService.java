package udemy.spring.petclinic.service.map;

import org.springframework.stereotype.Service;
import udemy.spring.petclinic.model.Pet;
import udemy.spring.petclinic.service.PetService;

import java.util.Set;
import java.util.UUID;

@Service
public class PetMapService extends AbstractMapService<Pet, UUID> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(UUID id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void deleteById(UUID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
