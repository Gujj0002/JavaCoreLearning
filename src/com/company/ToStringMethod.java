package com.company;

public class ToStringMethod {

    public static void main(String[] args) {

        Date obj = new Date(2,6,1993);
        Details objA = new Details("Alps", obj);
        System.out.println(objA);

    }
}
class Date{
    private int day, month, year;
    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
        System.out.printf("This is your Date %s\n", this);
    }


    @Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
class Details{
    private String name;
    private Date birthday;
    public Details(String myName, Date myDate){
        name = myName;
        birthday = myDate;
    }

    @Override
    public String toString() {
        return String.format("This is my name %s, and this is my birthday %s", name, birthday);
    }
}
