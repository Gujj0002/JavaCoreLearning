package com.company;

public class CountStringValue {
    public static void main(String[] args) {

        int str[] = {1,2,3,4,2,3,4,2,3,6,6,7,7};
        int count[] = new int[10];

        for (int i =0; i < str.length; i++){
            ++count[str[i]];
        }
        for (int j = 0; j < count.length; j++) {
            System.out.println(j + " " + count[j]);
        }
    }
}
