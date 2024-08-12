package com.chap13_collection.level01.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Application6 {
    public static void main(String[] args) {

        Map<String, String> userInfo = new HashMap<String, String>();

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String info = sc.nextLine();
            if(info.equals("exit")) break;
            else if(info.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String key = sc.nextLine();
                if(userInfo.containsKey(key)) System.out.println(key + "씨의 전화번호 : " + userInfo.get(key));
                else System.out.println(key + "씨의 번호는 등록 되어 있지 않습니다.");
            }
            else if(!info.contains(" ")) System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            else{
                StringTokenizer st = new StringTokenizer(info);
                String name = st.nextToken();
                String phoneNumber = st.nextToken();
                userInfo.put(name, phoneNumber);
                System.out.println("추가 완료 : " + name + " " + phoneNumber);

            }


        }



    }
}
