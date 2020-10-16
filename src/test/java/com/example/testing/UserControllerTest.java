package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {
    @Test
    public void testGetUserById() {
        UserController userController = new UserController();
        User user = userController.get(1L);
        assertEquals(1l, user.getId().longValue());
    }
}
