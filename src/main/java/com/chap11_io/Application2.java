package com.chap11_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String origin = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copy = sc.nextLine();

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(origin);
            fw = new FileWriter(copy);
            int value;
            while((value = fr.read()) != -1){
                fw.write(value);
            }

            System.out.println("파일의 복사가 성공적으로 완료 되었습니다.");

        } catch (IOException e) {
            System.out.println("오류 : " + origin + "(지정된 파일을 찾을 수 없습니다)");
        } finally {
            if(fr != null){
                try {
                    fr.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
            if(fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }

        }


    }
}
