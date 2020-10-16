package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    // USING AAA Pattern (Arrange, Act, Assert)
    @Test
    public void testHomeController() {
        HomeController homeController = new HomeController(); // Arrange
        String result = homeController.home(); // Act
        assertEquals(result, "Hello World!"); // Assert
    }
}
