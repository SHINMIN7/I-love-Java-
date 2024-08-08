package com.chap10_exception;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws Exception {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String input = sc.nextLine();



        try {

            LocalDate userDateTime = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDateTime localDateTime = LocalDateTime.now();

            int nowYear = localDateTime.getYear();
            int userYear = userDateTime.getYear();

            if(nowYear - userYear < 20) {
                System.out.println("만 20세 미만은 입장 불가입니다.");
            }else{
                System.out.println("입장하셔도 됩니다.");
            }

        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }

    }
}
