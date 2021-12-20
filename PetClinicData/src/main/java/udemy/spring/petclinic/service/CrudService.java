package udemy.spring.petclinic.service;

import udemy.spring.petclinic.exception.NullException;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object) throws NullException;

    void deleteById(ID id);

    void delete(T object);
}
