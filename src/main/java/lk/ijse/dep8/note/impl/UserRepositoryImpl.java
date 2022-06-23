package lk.ijse.dep8.note.impl;

import lk.ijse.dep8.note.custom.UserRepository;
import lk.ijse.dep8.note.entity.User;
import lk.ijse.dep8.note.repository.CrudRepositoryImpl;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class UserRepositoryImpl extends CrudRepositoryImpl<User,String>implements UserRepository {

    @Override
    public boolean existsByEmail(String email) {
       return !entityManager.createQuery("select u FROM lk.ijse.dep8.note.entity.User u WHERE User.email = :email")
                .setParameter("email", email).getResultList().isEmpty();
    }

}
