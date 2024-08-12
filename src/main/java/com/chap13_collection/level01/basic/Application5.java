package com.chap13_collection.level01.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("단어 입력 : ");
            String word = sc.nextLine();
            if(word.equals("exit")) break;
            else wordList.add(word);

        }

        Collections.sort(wordList);
        System.out.print("정렬 된 단어 : " + wordList);


    }
}
