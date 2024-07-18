package org.example.shape;

public class Circle extends AbstractionShape{

    public Circle(int radius) {
        this.radius = radius;
    }

    private final int radius;

    @Override
    public double getArea() {
        return 3 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3 * radius;
    }
}
