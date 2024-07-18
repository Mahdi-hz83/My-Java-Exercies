package org.example;

import org.example.shape.AbstractionShape;
import org.example.shape.Circle;
import org.example.shape.Rectangle;
import org.example.shape.Square;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AbstractionShapeTest {
    private Circle circle;
    private Rectangle rectangle;

    @Before
    public void setUp() {
        this.circle = new Circle(2);
        this.rectangle = new Rectangle(2,3);
    }

    @Test
    public void testCircleArea() {
        assertEquals(75, circle.getArea(), 0);
    }

    @Test
    public void testCirclePerimeter() {
        assertEquals(30, circle.getPerimeter(), 0);
    }

    @Test
    public void testRectangleArea() {
        assertEquals(12, rectangle.getArea(), 0);
    }

    @Test
    public void testRectanglePerimeter() {
        assertEquals(14, rectangle.getPerimeter(), 0);
    }

    @Test
    public void testMoz() {
        List<AbstractionShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Rectangle(2, 2));
        shapes.add(new Square(6));

        for (AbstractionShape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}