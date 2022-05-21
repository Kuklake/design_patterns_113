package pl.sda.java.designPatterns.structural.facade;


import java.util.Arrays;
import java.util.List;

public class ShapesDrawer {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapesDrawer() {
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawSquare(){
        return square.draw();
    }

    public String drawRectangle(){
        return rectangle.draw();
    }

    public String drawShapes(){

        List<String> drawers = Arrays.asList(
                circle.draw(),
                square.draw(),
                rectangle.draw()
        );
        return String.join(",", drawers);
    }
}