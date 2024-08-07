package com.shin;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.checkMethod();
        System.out.println(calculator.sum1to10());
        calculator.checkMaxNumber(10, 20);
        System.out.println(calculator.sumTwoNumber(10, 20));
        System.out.println(calculator.minusTwoNumber(10, 5));


    }

    public void checkMethod(){
        System.out.println("checkMethod 호출");
    }
    public int sum1to10(){
        int sum = 0;
        for(int i=0; i<10; i++){ sum += i; }
        return sum;
    }

    public void checkMaxNumber(int a, int b){
        int result = a > b ? a : b;
        System.out.println(result);
    }

    public int sumTwoNumber(int a, int b){ return a+b; }
    public int minusTwoNumber(int a, int b){ return a-b;}


}
