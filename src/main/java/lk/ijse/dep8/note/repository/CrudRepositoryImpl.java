package lk.ijse.dep8.note.repository;

import lk.ijse.dep8.note.entity.SuperEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class CrudRepositoryImpl<T extends SuperEntity, ID extends Serializable> implements CrudRepository<T,ID> {
    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T>entityClzObj;

    @Override
    public T save(T entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void deleteById(ID pk) {
entityManager.remove(entityManager.getReference(entityClzObj,pk));
    }

    @Override
    public boolean existsById(ID pk) {
        return findById(pk).isPresent();
    }

    @Override
    public Optional<T> findById(ID pk) {
        return Optional.of(entityManager.find(entityClzObj,pk));
    }

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("SELECT e FROM "+entityClzObj.getName()+" e",entityClzObj).getResultList();
    }

    @Override
    public long count() {
        return entityManager.createQuery("SELECT count (e) FROM "+entityClzObj.getName()+" e",Long.class).getSingleResult();
    }
}
