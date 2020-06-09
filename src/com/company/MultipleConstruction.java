package com.company;

public class MultipleConstruction {

    public static void main(String[] args) {

        Time obj = new Time();
        Time obj1 = new Time(12,0,0);
        Time obj2 = new Time(12,45,0);
        Time obj3 = new Time(12,45,52);
        System.out.println(obj.toMilitary());
        System.out.println(obj1.toMilitary());
        System.out.println(obj2.toMilitary());
        System.out.println(obj3.toMilitary());
    }
}
class Time {

    private int hour, minute, second;
    public Time(){

        this(0,0,0);
    }
    public Time(int hour){

        this(hour,0,0);
    }
    public Time(int hour,int minute){

        this(hour, minute, 0);
    }
    public Time(int hour, int minute, int second){

        setTime(hour,minute,second);
    }
    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public void setHour(int hour) {

        this.hour = ((hour >=0 && hour <24)? hour:0);
    }
    public int getHour() {

        return hour;
    }
    public void setMinute(int minute) {

        this.minute = ((minute >=0 && minute <60)? minute:0);
    }
    public int getMinute() {

        return minute;
    }
    public void setSecond(int second) {

        this.second = ((second >=0 && second <60)? second:0);
    }
    public int getSecond() {

        return second;
    }
    public String toMilitary(){

        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}