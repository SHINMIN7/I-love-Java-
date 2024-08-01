package com.chap04_control_flow.level01_basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0) System.out.println("양수다.");
        else System.out.println("양수가 아니다.");
    }
}
