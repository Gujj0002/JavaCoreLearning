package com.company;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int number;

        for (int i =1; i <= 10; i++){

            number = random.nextInt(50) + 1;
            System.out.print(number + " ");
        }
    }
}
