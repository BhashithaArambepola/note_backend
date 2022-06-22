package lk.ijse.dep8.note.impl;

import lk.ijse.dep8.note.custom.NoteRepository;
import lk.ijse.dep8.note.custom.UserRepository;
import lk.ijse.dep8.note.entity.Note;
import lk.ijse.dep8.note.entity.User;
import lk.ijse.dep8.note.repository.CrudRepositoryImpl;
import org.springframework.stereotype.Repository;


@Repository
public class NoteRepositoryImpl extends CrudRepositoryImpl<Note,Integer>implements NoteRepository {

}
