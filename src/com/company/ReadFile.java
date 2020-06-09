package com.company;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        write F = new write();
        F.read();
        F.open();
        F.close();


    }
}

class write {
    private Scanner z;

    public void open() {
        try {
            z = new Scanner(new File("File.txt"));

        } catch (Exception e) {
            System.out.println("File does not exist!");
        }
    }

    public void read() {           // Get data from existing file.....
        while (z.hasNext()) {
            String a = z.next();
            String b = z.next();
            String c = z.next();

            System.out.printf("%s %s %s\n", a, b, c);
        }
    }

    public void close() {
        z.close();
    }
}
