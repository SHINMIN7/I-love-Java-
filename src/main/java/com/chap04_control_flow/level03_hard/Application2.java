package com.chap04_control_flow.level03_hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("과일을 입력해 주세요 : ");
        String input = sc.nextLine();

        switch (input) {
            case "사과":
                System.out.println(input + "의 가격은 :  1000원 입니다.");
                break;
            case "바나나":
                System.out.println(input + "의 가격은 :  2000원 입니다.");
                break;
            case "복숭아":
                System.out.println(input + "의 가격은 :  3000원 입니다.");
                break;
            case "키위":
                System.out.println(input + "의 가격은 :  4000원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                break;
        }
    }
}
