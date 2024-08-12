package com.chap13_collection.level01.basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application4 {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<String>();

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String input = sc.nextLine();
            if(input.equals("exit")) break; //종료조건
            else{
                if(hashSet.contains(input)) System.out.println("이미 등록 된 ID입니다.");
                else {
                    hashSet.add(input);
                    System.out.println("ID가 추가 되었습니다.");
                }
            }
        }

        System.out.print("모든 학생의 ID : " + hashSet);


    }
}
