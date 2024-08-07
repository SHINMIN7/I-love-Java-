package com.chap08_polymorphism.level01_basic;


import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;


    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        /* 원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이 의미를 가진다. */
        //System.arraycopy(shapes, 0, newShapes, 0, shapes.length);


//        if(index == shapes.length) {
//            Shape[] resizeShapes = new Shape[shapes.length * 2];
//            System.arraycopy(shapes, 0, resizeShapes, 0, shapes.length);
//            shapes = resizeShapes;
//        }
        if (index >= shapes.length) {
            shapes = Arrays.copyOf(shapes, shapes.length * 2);
        }

        shapes[index++] = shape;

    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */

        for (int i = 0; i < index; i++) {
            if (shapes[i].equals(shape)) {
                for (int j = i; j < index - 1; j++) {
                    shapes[j] = shapes[j + 1];
                }
                shapes[index - 1] = null;
                index--;
                break;
            }
        }

    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for(int i=0; i<index; i++) { // 현재 저장되어 있는 곳까지 출력
            //System.out.println("Shape: " + shapes[i].getName());
            System.out.println("Shape: " + shapes[i].getClass().getSimpleName());
            System.out.println("Area: " + shapes[i].calculateArea());
            System.out.println("Perimeter: " + shapes[i].calculatePerimeter());
        }

    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double totalArea = 0;
//        for(Shape shape : shapes) {// 이경우 shapes의 모든 공간을 다 출력
//            totalArea += shape.calculateArea();
//        }
        for(int i=0; i<index; i++){
            totalArea += shapes[i].calculateArea();
        }

        return totalArea;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환
        *  향상된 for문을 쓰면 null로 비어있는 공간까지 모두 출력되므로 주의! */

        double totalPerimeter = 0;
//        for(Shape shape : shapes) {
//            totalPerimeter += shape.calculatePerimeter();
//        }
        for(int i=0; i<index; i++){
            totalPerimeter += shapes[i].calculatePerimeter();
        }

        return totalPerimeter;
    }
}
