package com.company;

public class CompoundInterest {

    public static void main(String[] args) {

        double amount;
        double principal = 20000;
        double rate = .03;

        for (int i = 0; i <= 20; i++){

            amount = principal * Math.pow((1 + rate), i);   // Maths conditions......
            System.out.println( i + " : " + amount);
        }
    }
}
