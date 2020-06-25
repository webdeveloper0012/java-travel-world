package com.brainstation.demo.socialmedia.TravelWorld;

import com.brainstation.demo.socialmedia.TravelWorld.model.User;
import com.brainstation.demo.socialmedia.TravelWorld.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void getUser() {
        List<User> userList = userService.findAllUser();

        User user = userService.findByUserName("meraihan");
        log.info("User Object: {}", user);

        log.info("User Data: {}", userList);
    }

}
