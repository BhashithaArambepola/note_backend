package lk.ijse.dep8.note.impl;
import lk.ijse.dep8.note.config.WebAppConfig;
import lk.ijse.dep8.note.config.WebRootConfig;
import lk.ijse.dep8.note.custom.UserRepository;
import lk.ijse.dep8.note.entity.User;
//import lk.ijse.dep8.note.repository.custom.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Transactional()
@SpringJUnitConfig({WebRootConfig.class, WebAppConfig.class})
class UserRepositoryImplTest {


    @Autowired
    private UserRepository userRepository;


    @Test
    void save() {
        //given
        User bhashi = new User(UUID.randomUUID().toString(), "hash@gmail.com", "1234", "bhashi");
        //when
        User savedUser = userRepository.save(bhashi);
        //then
        assertEquals(bhashi, savedUser);
    }

    @Test
    void deleteById() {
        //given
        User bhashi = new User(UUID.randomUUID().toString(), "hash@gmail.com", "1234", "bhashi");
        userRepository.save(bhashi);
        //when
        assertTrue(userRepository.existsById(bhashi.getId()));
        userRepository.deleteById(bhashi.getId());
        //then
        assertFalse(userRepository.existsById(bhashi.getId()));

    }

    @Test
    void existsById() {

    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
        //given
        User bhashi = new User(UUID.randomUUID().toString(), "hash@gmail.com", "1234", "bhashi");
        User lahiru = new User(UUID.randomUUID().toString(), "hash21@gmail.com", "1234", "Lahiru");
        userRepository.save(bhashi);
        userRepository.save(lahiru);
        //when
        List<User> users = userRepository.findAll();
        //then
        assertTrue(users.size()>=2);
    }

    @Test
    void count() {
        //given
        User bhashi = new User(UUID.randomUUID().toString(), "hash@gmail.com", "1234", "bhashi");
        User lahiru = new User(UUID.randomUUID().toString(), "hash21@gmail.com", "1234", "Lahiru");
        userRepository.save(bhashi);
        userRepository.save(lahiru);
        assertTrue(userRepository.findAll().size()>=2);

    }


    @Test
    void existsUserByEmail() {
        //given
        User bhashi = new User(UUID.randomUUID().toString(), "bhashi@gmail.com", "1234", "Bhashitha");
        User lahiru = new User(UUID.randomUUID().toString(), "lahiru@gmail.com", "1234", "Lahiru");
        userRepository.save(bhashi);
        userRepository.save(lahiru);

        //when
        assertTrue(userRepository.existsByEmail("bhashi@gmail.com"));
        assertTrue(userRepository.existsByEmail("lahiru@gmail.com"));
    }
}