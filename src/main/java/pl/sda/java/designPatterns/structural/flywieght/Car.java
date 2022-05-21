package pl.sda.java.designPatterns.structural.flywieght;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Car implements Vehicle {

    private Color color;

    @Override
    public Color getColor() {
        return this.color;
    }
}
