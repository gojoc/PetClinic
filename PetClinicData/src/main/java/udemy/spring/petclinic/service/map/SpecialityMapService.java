package udemy.spring.petclinic.service.map;

import org.springframework.stereotype.Service;
import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.Speciality;
import udemy.spring.petclinic.service.SpecialityService;

import java.util.Set;
import java.util.UUID;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, UUID> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(UUID id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality speciality) throws NullException {
        return super.save(speciality);
    }

    @Override
    public void deleteById(UUID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }
}
