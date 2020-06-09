package com.company;

import java.io.File;
import java.util.Formatter;

public class FileClasses {
    public static void main(String[] args) {

        /* How to check your file by file name....*/

        File x = new File("C:\\Users\\Alpesh\\Desktop\\File.txt");
        if (x.exists()){
            System.out.println(x.getName() + " exist!");
        }

        /* How to create new file....*/

        createFile file = new createFile();
        file.openFile();
        file.addRecords();
        file.closeFile();


    }
}
class createFile{
    private Formatter y;
    public void openFile(){
        try {
            y= new Formatter("C:\\Users\\Alpesh\\Desktop\\Alps.txt");  // This will create a file..
            System.out.println("You have created a new file!");
        }catch (Exception e){
            System.out.println("File does not exist!");
        }
    }
    public void addRecords(){
        y.format("%s\t%s\t%s\t", "10", "Alps", "Gujjar");   // Add records in the file...
    }
    public void closeFile(){
        y.close();                 // Close the file.......
    }
}
