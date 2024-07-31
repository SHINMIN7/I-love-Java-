package com.shin.level02.normal;

import java.util.Random;


public class RandomMaker {

    public static int randomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String randomUpperAlpabet(int lenght){
        Random random = new Random();
        String s = "";
        int start = 'A';
        int end = 'Z';

        for(int i=0; i<lenght; i++){
            char ch = (char) (random.nextInt(end - start + 1) + start);
            s += String.valueOf(ch);
        }
        return s;
    }

    public static String rockPaperScissors(){
        Random random = new Random();
        int randNumber = random.nextInt(3);
        if(randNumber == 0) {return "가위";}
        else if(randNumber == 1) { return "바위";}
        else {return "보";}

    }

    public static String tossCoin(){
        Random random = new Random();
        int randNubmer = random.nextInt(2);
        if(randNubmer == 0){ return "앞면";}
        else { return "뒷면"; }

    }

}
