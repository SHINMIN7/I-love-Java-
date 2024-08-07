package com.chap08_polymorphism.level01_basic;

public class Rectangle extends Shape implements Resizable{
    private String name = "Rectangle";
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void resize(double factor) {
        length = length * factor;
        width = width * factor;
    }

    @Override
    public String getName() {
        return name;
    }

}
