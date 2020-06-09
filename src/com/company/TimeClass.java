package com.company;

public class TimeClass {

    public static void main(String[] args) {

        time obj = new time();
        System.out.println(obj.toMilitary());

        obj.setTime(12,45,58);
        System.out.println(obj.toMilitary());
    }
}
class time{
    private int hour, minute, second;

    public void setTime(int h, int m, int s){
        hour = ((h >=0 && h <=24) ? h:0);              // Conditional operator
        minute = ((m >=0 && m <=60) ? m:0);
        second = ((s >=0 && s <=60) ? s:0);
    }
    public String toMilitary(){

        return String.format("%02d:%02d:%02d", hour, minute,second);
    }
}
