package com.chap11_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String input = sc.nextLine();

        FileReader fr = null;
        try {
            fr = new FileReader(input);
            int value;
            while((value = fr.read()) != -1){
                System.out.print((char)value);
            }
        } catch (IOException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
