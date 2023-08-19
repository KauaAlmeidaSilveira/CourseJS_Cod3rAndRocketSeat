package Model.Entities;

import Model.Enums.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI*Math.pow(radius, 2);
    }
}