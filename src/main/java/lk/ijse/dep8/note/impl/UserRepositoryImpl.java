package lk.ijse.dep8.note.impl;

import lk.ijse.dep8.note.custom.UserRepository;
import lk.ijse.dep8.note.entity.User;
import lk.ijse.dep8.note.repository.CrudRepositoryImpl;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepositoryImpl extends CrudRepositoryImpl<User,String>implements UserRepository {

}
