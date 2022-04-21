package pl.konstanty.services;

import java.util.Set;


//Thanks to this mimicking of CrudServiceRepository interface we reduced code a lot and
// we are not duplicating code in interfaces that share the same methods
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
