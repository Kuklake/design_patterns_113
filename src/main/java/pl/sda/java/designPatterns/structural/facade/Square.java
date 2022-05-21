package pl.sda.java.designPatterns.structural.facade;

public class Square implements Shape {
    @Override
    public String draw() {
        return "drawing square";
    }
}