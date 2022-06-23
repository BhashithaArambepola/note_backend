package lk.ijse.dep8.note.custom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class QueryRepositoryImpl implements QueryRepository{

    @PersistenceContext
    private EntityManager entityManager;
}
