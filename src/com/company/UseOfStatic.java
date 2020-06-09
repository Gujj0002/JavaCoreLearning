package com.company;

public class UseOfStatic {

    public static void main(String[] args) {

        club obj1 = new club("Alps", "Gujjar");
        club obj2 = new club("patric", "Mali");
        club obj3 = new club("jai", "Patel");

        System.out.println(" ");
        System.out.println(obj1.getfName());
        System.out.println(obj1.getlName());
        System.out.println(obj1.getMembers());
        System.out.println();

        System.out.printf("Totoal members of club are: %d", club.getMembers());    // This will print total number of members

    }
}

class club {
    private String fName, lName;
    private static int members = 0;

    public club(String firstName, String lastName) {

        fName = firstName;
        lName = lastName;
        members++;

        System.out.printf("This is %s %s, member of the club: %d\n", fName, lName, members);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public static int getMembers() {
        return members;
    }
}
