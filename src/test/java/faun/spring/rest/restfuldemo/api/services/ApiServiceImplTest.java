package faun.spring.rest.restfuldemo.api.services;

import faun.spring.rest.restfuldemo.api.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void testGetUsers() {
        List<User> users = apiService.getUsers(3);
        assertEquals(4, users.size());
    }
}