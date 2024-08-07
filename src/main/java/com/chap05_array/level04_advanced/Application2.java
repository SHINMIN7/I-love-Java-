package com.chap05_array.level04_advanced;

import java.awt.*;
import java.util.Scanner;
import java.util.Spliterator;

public class Application2 {
    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */

        int[] randNums = new int[4];
        boolean[] check = new boolean[10];
        int idx = 0;
        while (true){

            if(idx == 4) break;

            int rand = (int)(Math.random() * 10);
            if(!check[rand]) {
                randNums[idx] = rand;
                check[rand] = true;
                idx++;
            }
        }

        //테스트용 코드
        System.out.print("정답은 : ");
        for (int i = 0; i < randNums.length; i++) {
            System.out.print(randNums[i]);
        }
        System.out.println();


        int cnt = 10;

        while (true) {

            System.out.println(cnt + "회 남으셨습니다.");
            Scanner sc = new Scanner(System.in);
            System.out.print("4자리 숫자를 입력하세요 : ");
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            int[] inputNums = new int[4];

            //4자리 정수 판단
            boolean isNumber = true;
            if(chars.length !=4) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            for(int i = 0; i < 4; i++) {
                if(chars[i] >= '0' && chars[i] <= '9') {
                    inputNums[i] = chars[i] - '0';
                }else{
                    System.out.println("4자리의 정수를 입력해야 합니다.");
                    isNumber = false;
                    break;
                }
            }

            if(!isNumber) continue;


            // 4자리 정수를 정상적으로 입력
            cnt--;
            int strike = 0;
            int ball = 0;
            boolean[] isRandNums = new boolean[10];
            boolean[] isInputNums = new boolean[10];
            //스트라이크 확인
            for(int i=0; i<4; i++){
                if(randNums[i] == inputNums[i]) strike++;
            }
            //볼
            //볼 번호 마킹
            for(int i=0; i<inputNums.length; i++) {
                isRandNums[randNums[i]] = true;
                isInputNums[inputNums[i]] = true;
            }
            //볼 번호 비교
            for(int i=0; i<10; i++) {
                if(isRandNums[i] && isInputNums[i]  && (isRandNums[i] == isInputNums[i])) ball++;
            }

            if(strike == 4) {
                System.out.println("정답입니다.");
                break; //루프 탈출
            }else{
                System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
            }




        }






    }
}
