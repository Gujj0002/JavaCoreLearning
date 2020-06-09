package com.company;

public class LengthOfVariable {

    public static void main(String[] args) {
        System.out.println(Average(45,25,12,32,47,15,12));

    }
    public static int Average(int...numbers){
        int total = 0;
        for (int x : numbers)
            total += x;

            return total/numbers.length;
        }

}
