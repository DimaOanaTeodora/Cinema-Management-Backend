package com.backend.cinema.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.backend.cinema.model.User;
import com.backend.cinema.repository.UserRepository;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.*;

@ActiveProfiles("test") //the test will use the configuration from the application-test.properties file
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class UserServiceTest {
	
	@MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    @DisplayName("Create user - happy flow")
    public void createUser() {
        User user = new User("oanadima26@gmail.com", "Dima", "Oana-Teodora");
        when(userRepository.findByEmail(user.getEmail())).thenReturn(Optional.empty());

        User savedUser = new User(1, "oanadima26@gmail.com", "Dima", "Oana-Teodora");
        when(userRepository.save(user)).thenReturn(savedUser);

        User result = userService.createUser(user);

        assertNotNull(result);
        assertNotNull(result.getId());
        assertEquals(savedUser.getId(), result.getId());
        assertEquals(savedUser.getEmail(), result.getEmail());
        assertEquals(savedUser.getFirstName(), result.getFirstName());
        assertEquals(savedUser.getLastName(), result.getLastName());
    }

}
