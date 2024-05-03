package org.howard.edu.lsp.oopfinal.question3;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ShapeFactoryTest {
    @Test
    @DisplayName("Test for CreateRectangle method")
    public void testCreateRectangle() {
        Shape rectangle = ShapeFactory.createShape("rectangle");
        rectangle.draw();
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
    
    @Test
    @DisplayName("Test for CreateCicle method")
    public void testCreateCircle() {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }
}