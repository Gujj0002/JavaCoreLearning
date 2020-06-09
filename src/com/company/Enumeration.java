package com.company;

import java.util.EnumSet;

public class Enumeration {

    public static void main(String[] args) {

        for (data list : data.values()) {

            System.out.printf("%s\t%s\t%s\t", list, list.getDec(), list.getYear());

        }

        /* Set the range between enum list using Enumset method ....*/

        System.out.println("\nHow to set range between enum");
        for (data listA : EnumSet.range(data.Alps, data.Jai)) {

            System.out.printf("%s\t%s\t%s\t", listA, listA.getDec(), listA.getYear());


        }

    }
}

enum data {

    Alps("speaker", "12"),
    patric("chef", "14"),
    Jai("singer", "18"),
    Dirty("Dancer", "20"),
    harry("Smoker", "22");

    private final String Dec;
    private final String year;

    data(String description, String age) {
        Dec = description;
        year = age;
    }

    public String getDec() {
        return Dec;
    }

    public String getYear() {
        return year;
    }
}
