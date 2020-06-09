package com.company;

public class FinalKeyword {

    public static void main(String[] args) {

        Add obj = new Add(10);

        for (int i =0; i <=5; i++){
            obj.add();
            System.out.printf("%s", obj);
        }
    }
}
class Add{
    private int sum;
    private final int Number;   // you can not change the value of final variable in main method...

    public Add(int x){
        Number = x;
    }
    public void add(){
        sum += Number;
    }

    @Override
    public String toString() {
        return String.format("Sum = %d\n", sum);
    }
}

