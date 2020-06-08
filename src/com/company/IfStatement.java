package com.company;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        int A, B;
        A = 10;
        B = 15;

        if (A <= 8)
            System.out.println("A is small");
        else if (B <= 15)
            System.out.println("B is small");

        /* if statement with logical operators*/

        if (A < 10 && B <= 15)                 // AND operator
            System.out.println("A is big");
        else
            System.out.println("B is big");

        if (A < 10 || B <= 15)              // OR operator
        System.out.println("A is big");
        else
        System.out.println("B is big");
    }
}
