package com.backend.cinema;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.backend.cinema.exception.DuplicateUserException;
import com.backend.cinema.model.User;
import com.backend.cinema.repository.UserRepository;
import com.backend.cinema.service.UserService;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

//    @Test
//    void whenUserAlreadyExists_create_throwsDuplicateUserException() {
//        // Arrange
//        User user = new User();
//        user.setFirstName("Bali");
//        when(userRepository.findByFirstName(user.getFirstName()))
//                .thenReturn(Optional.of(user));
//
//        // Act
//        DuplicateUserException exception = assertThrows(DuplicateUserException.class,
//                () -> userService.createUser(user));
//
//        // Assert
//        assertEquals("A user with the same name already exists.", exception.getMessage());
//        verify(userRepository, times(0)).save(user);
//
////        !!! here I cannot check with verifyNoInteractions(), because the execution has one interaction
////        with userRepository, when calling the findByName() method. so I have to be specific,
////        and check only that the execution didn't call the save() method
//    }
//
//    @Test
//    void whenUserDoesntExist_create_savesTheUser() {
//        // Arrange
//        User user = new User();
//        user.setFirstName("Bali");
//        when(userRepository.findByFirstName(user.getFirstName()))
//                .thenReturn(Optional.empty());
//        User savedUser = new User();
//        savedUser.setFirstName("Bali");
//        savedUser.setId(1);
//        when(userRepository.save(user)).thenReturn(savedUser);
//
//        // Act
//        User result = userService.createUser(user);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(savedUser.getId(), result.getId());
//        assertEquals(savedUser.getFirstName(), result.getFirstName());
//        assertEquals(user.getFirstName(), result.getFirstName());
//        verify(userRepository).findByFirstName(user.getFirstName());
//        verify(userRepository).save(user);
//    }
//
//    @Test
//    void whenUserExists_findById_returnsTheUser() {
//        // Arrange
//        User user = new User();
//        user.setId(1);
//        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
//
//        // Act
//        Optional<User> result = userService.findById(1);
//
//        // Assert
//        assertNotNull(result);
//        assertTrue(result.isPresent());
//        assertEquals(user.getId(), result.get().getId());
//    }
//
//    @Test
//    void whenUserDoesntExists_findById_returnsEmptyOptional() {
//        // Arrange
//        when(userRepository.findById(1L)).thenReturn(Optional.empty());
//        // Act
//        Optional<User> result = userService.findById(1);
//
//        // Assert
//        assertNotNull(result);
//        assertTrue(result.isEmpty());
//    }
}
