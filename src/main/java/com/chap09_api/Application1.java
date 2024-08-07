package com.chap09_api;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) {
        /* 대문자 변환기 */
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String inputString = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(inputString);
        int cnt = 0;
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            sb.append(str.substring(0, 1).toUpperCase());
            sb.append(str.substring(1));
            sb.append(" ");
            cnt++;
        }
        System.out.println("변환된 문자열: " + sb);
        System.out.println("총 단어 개수: " + cnt );

    }
}
