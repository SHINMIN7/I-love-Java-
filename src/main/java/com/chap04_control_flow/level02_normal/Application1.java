package com.chap04_control_flow.level02_normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 10) {
            if(num % 2 == 0) System.out.println("짝수다");
            else System.out.println("홀수다");
        }else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }
}
