package cscie55.hw4.utils;


import java.util.Random;

public class NumUtil {

    static Random random = new Random();

    public static int getRandomBetween(int min, int max){

        return random.nextInt(max + 1 - min) + min;
    }

}