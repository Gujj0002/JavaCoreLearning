package com.company;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        /* How to use exception in Java.....*/

        Scanner scanner = new Scanner(System.in);

        int x = 1;
        do {
            try {
                System.out.print("Enter a first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter a second number: ");
                int num2 = scanner.nextInt();

                int num = num1 / num2;
                System.out.print("Your number is: " +num);
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid number!");
            }
        } while (x == 1);

    }
}
