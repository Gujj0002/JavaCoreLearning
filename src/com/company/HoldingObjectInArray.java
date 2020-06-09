package com.company;

public class HoldingObjectInArray {

    public static void main(String[] args) {

        List obj = new List();
        B objB = new B();
        C objC = new C();
        obj.Added(objB);
        obj.Added(objC);

    }
}

class List {
    private int i = 0;
    private A theList[] = new A[5];    // This will array of object...

    public void Added(A d) {
        if (i < theList.length) {
            theList[i] = d;    // add value in index of array...
            System.out.println("Data added in index " + i);
            i++;
        }
    }
}

class A {     // super class....

}

class B extends A {             // Sub classes....

}

class C extends A {

}
