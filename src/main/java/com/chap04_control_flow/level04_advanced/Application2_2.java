package com.chap04_control_flow.level04_advanced;

import java.util.Scanner;

public class Application2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("받으신 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        int remainderMoney = money - price;


        int fiftyThousandWonBill = remainderMoney / 50000;
        int tenThousandWonBill = (remainderMoney % 50000) / 10000;
        int fiveThousandWonBill = (remainderMoney % 10000) / 5000;
        int oneThousandWonBill = (remainderMoney % 5000) / 1000;
        int fiveHundredWonCoin = (remainderMoney % 1000) / 500;
        int oneHundredWonCoin = (remainderMoney % 500) / 100;
        int fiftyWonCoin = (remainderMoney % 100) / 50;
        int tenWonCoin = (remainderMoney % 50) / 10;

        System.out.println("=====================");
        System.out.println("50000원권 지폐 " + fiftyThousandWonBill +"장");
        System.out.println("10000원권 지폐 " + tenThousandWonBill +"장");
        System.out.println("5000원권 지폐 " + fiveThousandWonBill +"장");
        System.out.println("1000원권 지폐 " + oneThousandWonBill +"장");
        System.out.println("500원권 동전 " + fiveHundredWonCoin +"개");
        System.out.println("100원권 동전 " + oneHundredWonCoin +"개");
        System.out.println("50원권 동전 " + fiftyWonCoin +"개    ");
        System.out.println("10원권 동전 " + tenWonCoin +"개");
        System.out.println("거스름돈 : " + remainderMoney);


    }
}
