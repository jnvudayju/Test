package org.acme.Interface;


interface drawable{
    void draw();
}

class Rectangle implements drawable{

    @Override
    public void draw() {
        System.out.println("rectangle draw...");
    }
}

class Circle implements drawable{

    @Override
    public void draw() {
        System.out.println("Circle draw....");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        rectangle.draw();
        circle.draw();

        drawable d1 = new Circle();
        d1.draw();

        drawable d2 = new Rectangle();
        d2.draw();
    }
}
