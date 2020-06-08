package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Input data from users */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("your name is " + name);

        /* How to make normal Calculator */
        double fNum, sNum, total;

        System.out.print("Enter first number :");
        fNum = scanner.nextDouble();
        System.out.print("Enter second number :");
        sNum = scanner.nextDouble();
        total = fNum + sNum;
        System.out.println("Your total is " + total);

        /* Maths Operator */
        int A, B, C;
        A = 10;
        B = 15;
        C = A % B;     // you can try with +, -, *, / ....
        System.out.println(C);

        C += A;            // Increment Operators ... *=, -=, +=, ++, -- ....
        System.out.println(C);


        /* Conditional Operator*/
        int age = 25;
        System.out.println( age < 30 ? "You're younger": "You're older");



    }
}
