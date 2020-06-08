package com.company;

public class string {
    public static void main(String[] args) {
        String s1 = "Alpesh";
        String s2 = "Alpesh";
        System.out.println( s1 == s2);

        String s3 = new String("Alpesh");
        String s4 = new String("Alpesh");
        System.out.println( s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
