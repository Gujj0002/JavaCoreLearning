package com.company;

public class TimeClass {

    public static void main(String[] args) {

        time obj = new time();
        obj.setTime(14,58,45);
        System.out.println(obj.toMilitary());   // Calling methods.....
        System.out.println(obj.toString());

    }
}
class time{
    private int hour, minute, second;

    public void setTime(int h, int m, int s){
        hour = ((h >=0 && h <=24) ? h:0);              // Conditional operator
        minute = ((m >=0 && m <=60) ? m:0);
        second = ((s >=0 && s <=60) ? s:0);
    }
    public String toMilitary(){     // Military time format

        return String.format("%02d:%02d:%02d", hour, minute,second);
    }
    public String toString(){    // Regular time format

        return String.format("%02d:%02d:%02d %s",
                (hour ==0 && hour ==12)? 12:hour%12,minute,second, (hour <=12 ? "AM":"PM"));
    }
}
