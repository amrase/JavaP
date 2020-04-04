package ArraysTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myInteger = getIntegers(5);
        int[] sortedArray = sortedArray(myInteger);
        printArray(sortedArray);

//        printArray(myInteger);
//        System.out.println("The average is " + getAverage(myInteger));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0;i<values.length;i++){
            values[i]= scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }


    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element #"+ i +" value is " + array[i]);
        }
    }


    public static int[] sortedArray(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i=0;i<array.length;i++){
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp ;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i] <sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return  sortedArray;
    }


}
