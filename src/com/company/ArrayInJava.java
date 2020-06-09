package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ArrayInJava {
    public static void main(String[] args) {

        int list[] = new int[05];
        list[00] = 12;
        list[01] = 14;
        list[03] = 16;
        list[04] = 17;
        System.out.println(list[03]);

        int listA[] = {1, 2, 3, 4, 5, 6};
        System.out.println(listA[3]);

        /* Array table */
        int A[] = {1, 3, 6, 8, 9, 4};

        System.out.println("Index\tvalue");

        for (int i = 0; i < A.length; i++) {

            System.out.println(i + "  \t" + A[i]);
        }

        /*  Sum of Array  */
        int B[] = {12, 34, 45, 56, 67, 54};
        int sum = 0;

        for (int i = 0; i < B.length; i++) {
            sum = sum + B[i];
        }
        System.out.println("The sum of Array is " + sum);


        /* Array counter..with random number */
        Random random = new Random();
        int counter[] = new int[15];

        for (int i = 0; i < counter.length; i++) {

            ++counter[1 + random.nextInt(15)];
        }
        System.out.println("number\ttimes");

        for (int j = 0; j < counter.length; j++) {
            System.out.println(j + " " + counter[j]);
        }
    }

}



