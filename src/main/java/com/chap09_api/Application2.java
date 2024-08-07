package com.chap09_api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        /* 텍스트 분석기 */
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        Scanner sc =  new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String inputString = sc.nextLine();
        System.out.println("===== 단어 빈도 =====");

        // 모든 특수 문자와 공백을 구분자로 지정
        String[] tokens = inputString.split("[^a-zA-Z]+");
        int idx = tokens.length;

        int[] arrCount = new int[idx];
        for (int i = 0; i < idx; i++) {
            arrCount[i] = 1;
        }
        boolean[] flag = new boolean[idx];


        for(int i=0; i<idx; i++){ //idx - 1?
            for(int j=i+1; j<idx; j++){
                if(!flag[i] && tokens[i].equals(tokens[j])){
                    arrCount[i]++;
                    flag[j] = true;
                }
            }
        }

        for(int i=0; i<idx; i++){
            if(!flag[i]){
                System.out.println(tokens[i] + ":" + arrCount[i]);
            }
        }

        int maxCount = 0;
        int maxIndex = 0;
        for(int i=0; i<idx; i++){
            if(arrCount[i] > maxCount){
                maxCount = Math.max(maxCount, arrCount[i]);
                maxIndex = i;
            }
        }

        System.out.println("가장 빈도 높은 단어 : " + tokens[maxIndex] + " (" + maxCount + " 번)");




    }
}
