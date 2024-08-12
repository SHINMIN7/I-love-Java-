package com.chap13_collection.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();



        while (true){

            Scanner sc = new Scanner(System.in);
            System.out.print("학생 성적 : ");
            int score = sc.nextInt();
            list.add(score);
            System.out.print("추가 입력하려면 y : ");
            if(sc.next().equals("n")) break;
        }

        int sum = 0;
        double average = 0;
        for(int i : list) sum += i;
        average = sum / (double)list.size();

        System.out.println("학생 인원 : " + list.size());
        System.out.println("평균 점수 : " + average);

    }
}
