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

        /* Enhanced for loop....*/
        int B[] = {12, 34, 45, 56, 67, 54};
        int sum = 0;

        for (int x : B) {
            sum = sum + x;
        }
        System.out.println("The sum of Array is " + sum);
    }

}
