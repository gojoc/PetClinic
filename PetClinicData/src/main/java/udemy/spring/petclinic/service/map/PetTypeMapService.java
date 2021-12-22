package udemy.spring.petclinic.service.map;

import org.springframework.stereotype.Service;
import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.PetType;
import udemy.spring.petclinic.service.PetTypeService;

import java.util.Set;
import java.util.UUID;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, UUID> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(UUID id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType petType) throws NullException {
        return super.save(petType);
    }

    @Override
    public void deleteById(UUID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }
}
