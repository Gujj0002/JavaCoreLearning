package com.company;

import java.util.Scanner;

public class GetAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int grade;
        int total = 0;
        int Average;

        while (i <= 10) {    // While loop.....
            grade = scanner.nextInt();
            total = total + grade;
            i++;
        }
        Average = total/10;
        System.out.println("Your average is " + Average);
    }
}
