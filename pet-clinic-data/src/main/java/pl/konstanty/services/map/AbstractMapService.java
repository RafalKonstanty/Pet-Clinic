package pl.konstanty.services.map;

import pl.konstanty.model.BaseEntity;

import java.util.*;

//we use Inheritance(extend) only when we want to get those behaviours without @Overriding them
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextID());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }

    private Long getNextID() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException exception){
            System.out.println("Exception handling: There are no Id set so we will create ID nr 1");
            nextId = 1L;
        }
        return nextId;
    }
}
