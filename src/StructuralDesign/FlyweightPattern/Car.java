package StructuralDesign.FlyweightPattern;

import java.awt.*;

public class Car implements Vehicle{

    private Engine engine;
    private Color color;

    public Car(Color color, Engine engine){
        this.color = color;
        this.engine = engine;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
