package udemy.spring.petclinic.service.map;

import udemy.spring.petclinic.exception.NullException;
import udemy.spring.petclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public abstract class AbstractMapService<T extends BaseEntity, ID extends UUID> {
    protected Map<UUID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) throws NullException {
        if (object == null) {
            throw new NullException("Object cannot be null.");
        }
        if (object.getId() == null) {
            object.setId(UUID.randomUUID());
        }
        map.put(object.getId(), object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.values().remove(object);
    }
}
