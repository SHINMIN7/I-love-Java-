package com.chap04_control_flow.level02_normal;

public class Application2_2 {
    public static void main(String[] args) {
        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */
        char ch1 = 'a';
        char ch2 = 'z';
        for(int i = ch1; i <= ch2; i++) {
            System.out.print((char)i);
        }

    }
}
