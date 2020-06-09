package com.company;

public class Arraymethods {

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 9};
        change(num);
        for (int y : num) {
            System.out.println(y);
        }
    }
    public static void change ( int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i] += 5;
        }
    }
}
