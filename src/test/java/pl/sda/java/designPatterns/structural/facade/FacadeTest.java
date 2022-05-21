package pl.sda.java.designPatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void shouldDrawCircle() {
        ShapesDrawer shapesDrawer = new ShapesDrawer();

        String circle = shapesDrawer.drawCircle();

        assertEquals("drawing circle", circle);
    }
}