package udemy.spring.petclinic.service.map;

import udemy.spring.petclinic.model.Owner;
import udemy.spring.petclinic.service.OwnerService;

import java.util.Set;
import java.util.UUID;

public class OwnerMapService extends AbstractMapService<Owner, UUID> implements OwnerService {
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
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
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
