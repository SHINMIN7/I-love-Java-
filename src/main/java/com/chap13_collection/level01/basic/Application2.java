package com.chap13_collection.level01.basic;

import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {

        Stack<String> storeUrl = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int maxCnt = 0;

        while (true) {

            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            Scanner sc = new Scanner(System.in);
            String url = sc.nextLine();
            if(url.equals("exit")) break;
            storeUrl.push(url);
            sb.insert(0, storeUrl);

            System.out.println("최근 방문 url : [" + sb + "]");
        }

    }
}
