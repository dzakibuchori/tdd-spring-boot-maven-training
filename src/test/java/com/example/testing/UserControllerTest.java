package com.example.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserControllerTest {
    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testGetUserById() {
        UserEntity u = new UserEntity();
        u.setId(1L);
        u.setUserName("some name");
        when(userService.getById(1L)).thenReturn(u);

        ResponseEntity<UserEntity> user = userController.get(1L);
        verify(userService).getById(1L);

        assertEquals(1L, Objects.requireNonNull(user.getBody()).getId());
    }
}
