package Practise;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args){
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add((new IntClass(54)));

//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(123.534354);

        //or


        Integer integer = 54;   //Object
        int myInt = integer.intValue();//Primitive Type

        System.out.println(myInt);
        Double doubleValue = 54.56;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double i = 0.0;i<=10.0; i +=0.5){
            myDoubleValues.add(i);
        }

        for(int i = 0;i<=10;i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i+ "->"+ value);
        }



        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i=0;i<=10;i++){
            //Outer Boxing
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i=0;i<=10;i++){
            System.out.println(i +"->" + integerArrayList.get(i).intValue());
        }
     }
}
