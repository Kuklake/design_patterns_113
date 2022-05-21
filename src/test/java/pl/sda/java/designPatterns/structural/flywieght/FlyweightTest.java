package pl.sda.java.designPatterns.structural.flywieght;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {
    @Test
    void shouldCreateOnlyOneVehicleWithColorBlue() {
        Color blue = Color.BLUE;

        Vehicle blueVehicle1 = VehicleFactory.createVehicle(blue);
        Vehicle blueVehicle2 = VehicleFactory.createVehicle(blue);

        assertTrue(blueVehicle1 == blueVehicle2);
    }

    @Test
    void shouldCreatedTwoVehiclesWithDiffColors() {
        Color blue = Color.BLUE;
        Color pink = Color.PINK;

        Vehicle blueVehicle1 = VehicleFactory.createVehicle(blue);
        Vehicle blueVehicle2 = VehicleFactory.createVehicle(pink);

        assertFalse(blueVehicle1 == blueVehicle2);
    }
}