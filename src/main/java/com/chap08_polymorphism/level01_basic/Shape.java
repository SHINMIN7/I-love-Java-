package com.chap08_polymorphism.level01_basic;

public abstract class Shape {
    /* 넓이 계산 메소드 */
    abstract double calculateArea();
    /* 둘레 계산 메소드 */
    abstract double calculatePerimeter();

    abstract String getName();
}
