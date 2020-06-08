package com.company;

public class LoopsInJava {

    public static void main(String[] args) {

        /* while loop */
        int i = 0;

        while (i < 15) {
            System.out.println(i);
            i++;
        }

        /* do while loop */
        int j = 15;
        do {
            System.out.println(j);
            j++;
        } while (j <= 15);

        /* for loop */
        for (int k = 0; k <= 20; k++) {
            System.out.println(k);
        }
    }
}
