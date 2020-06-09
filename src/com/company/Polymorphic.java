package com.company;

public class Polymorphic {

    public static void main(String[] args) {

             total obj = new total();
             Java objA = new Java();
             Java objB = new python();
             Java objC = new JavaScript();
             obj.teach(objA);
             obj.teach(objB);
             obj.teach(objC);
}
}
class Java{                     // super class
    void learn(){
        System.out.println("This is good programming language");
    }
}
class python extends Java{       // sub classes
    void learn(){
        System.out.println("This is kind of useful language");
    }
}
class JavaScript extends Java{
    void learn(){
        System.out.println("This is very useful language");
    }
}
 class total{
    public void teach(Java x){
        x.learn();
    }
}