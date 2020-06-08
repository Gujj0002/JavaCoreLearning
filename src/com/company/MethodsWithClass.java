package com.company;

import java.util.Scanner;

public class MethodsWithClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FirstName obj = new FirstName();
        System.out.print("Enter your first name: ");
        String name = scanner.nextLine();
        obj.setName(name);
        obj.show();


    }
}

class FirstName {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("you're first name is " + getName());
    }


}
