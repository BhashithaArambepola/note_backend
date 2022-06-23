package lk.ijse.dep8.note.impl;

import lk.ijse.dep8.note.config.WebAppConfig;
import lk.ijse.dep8.note.config.WebRootConfig;
import lk.ijse.dep8.note.custom.UserRepository;
import lk.ijse.dep8.note.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;




@Transactional
@SpringJUnitConfig({WebRootConfig.class,WebAppConfig.class})
class UserRepositoryImplTest {


    @Autowired
    private UserRepository userRepository;


    @Test
    void save() {

        //given
        User user = new User(UUID.randomUUID().toString(),"dulanga@ijse.lk","abc","DUlanga");

        //when

        User saveUSer=userRepository.save(user);
        //then
        assertEquals(user,saveUSer);
    }

    @Test
    void deleteById() {
    }

    @Test
    void existsById() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void count() {
    }
}