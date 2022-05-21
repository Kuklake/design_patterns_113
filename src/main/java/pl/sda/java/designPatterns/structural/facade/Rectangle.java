package pl.sda.java.designPatterns.structural.facade;

public class Rectangle implements Shape {
    @Override
    public String draw() {
        return "drawing rectangle";
    }
}
