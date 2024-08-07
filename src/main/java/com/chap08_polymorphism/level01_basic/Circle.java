package com.chap08_polymorphism.level01_basic;

public class Circle extends Shape implements Resizable{

    private String name = "Circle";
    private double radius;
//    public static final double PI = 3.14;


    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }


    @Override
    double calculatePerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }

        @Override
    public String getName() {
        return name;
    }

}

