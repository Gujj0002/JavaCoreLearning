package com.company;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int firstArray[][] = {{1, 3, 4, 5}, {23, 43, 56, 34, 54}};
        int secondArray[][] = {{2, 3, 6, 8, 9}, {4, 5, 1, 88, 5}, {12, 34, 67, 9, 76}};

        System.out.println("This is first Array :");
        display(firstArray);

        System.out.println("This is second Array :");
        display(secondArray);
    }

    public static void display(int x[][]) {

        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
        }
        System.out.println(" ");
    }
}
