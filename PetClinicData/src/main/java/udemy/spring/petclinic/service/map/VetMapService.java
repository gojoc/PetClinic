package udemy.spring.petclinic.service.map;

import udemy.spring.petclinic.model.Vet;
import udemy.spring.petclinic.service.VetService;

import java.util.Set;
import java.util.UUID;

public class VetMapService extends AbstractMapService<Vet, UUID> implements VetService {
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
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
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
