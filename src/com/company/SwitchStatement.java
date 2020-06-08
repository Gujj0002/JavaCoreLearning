package com.company;

public class SwitchStatement {

    public static void main(String[] args) {

        int age = 10;

        switch (age){
            case 05:
                System.out.println("You're younger");
                break;
            case 07:
                System.out.println("You're older than him");
                break;
            case 10:
                System.out.println("You're younger");
                break;
            default:
                System.out.println("You're not that older");
        }

    }
}
