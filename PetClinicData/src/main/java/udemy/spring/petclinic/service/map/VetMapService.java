package udemy.spring.petclinic.service.map;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.Speciality;
import udemy.spring.petclinic.model.Vet;
import udemy.spring.petclinic.service.SpecialityService;
import udemy.spring.petclinic.service.VetService;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@Service
public class VetMapService extends AbstractMapService<Vet, UUID> implements VetService {
    private final SpecialityService specialityService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(UUID id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return map.values()
                .stream()
                .filter(vet -> vet.getLastName().equals(lastName))
                .findAny()
                .orElse(null);
    }

    @Override
    public Vet save(Vet vet) throws NullException {
        if (vet == null) {
            throw new NullException("Vet cannot be null.");
        }
        Set<Speciality> specialities = vet.getSpecialities();
        if (specialities != null) {
            for (Speciality speciality : specialities) {
                if (speciality.getId() == null) {
                    speciality.setId(specialityService.save(speciality).getId());
                }
            }
        }
        return super.save(vet);
    }

    @Override
    public void deleteById(UUID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
