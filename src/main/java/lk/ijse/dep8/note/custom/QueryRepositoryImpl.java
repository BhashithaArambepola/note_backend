package lk.ijse.dep8.note.custom;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class QueryRepositoryImpl implements QueryRepository{

    @PersistenceContext
    private EntityManager entityManager;
}
