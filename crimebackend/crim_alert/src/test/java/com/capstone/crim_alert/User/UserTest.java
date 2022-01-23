package com.capstone.crim_alert.User;
import static org.junit.jupiter.api.Assertions.*;
import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.repository.UsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserTest {
private final UsRepository usRepository;
@Autowired
    public UserTest(UsRepository usRepository) {
        this.usRepository = usRepository;
    }

    @Test
    void itShouldFindUsByEmail(){
    String email = "meshl@gmail.com";
        Us user = new Us("123",email);

        usRepository.save(user);

        Us res = usRepository.findByEmail(email);
        assertEquals(email,res.getEmail());
    }
}
