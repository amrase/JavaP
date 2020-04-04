package ReferenceValues;


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
//        int returnedMin = findMin(returnedArray);
//
//        System.out.println("Min= " + returnedMin);
        System.out.println("Array"  + Arrays.toString(returnedArray));

        reverse(returnedArray);

         System.out.println("Reversed Array"+Arrays.toString(returnedArray));

    }

    private static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        return array;
    }


    private static int findMin(int[] array) {
        //Highest value that an integer can hold
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }


    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;

        for(int i=0;i<halfLength;i++){
                int swap =  array[i];
                array[i]  = array[maxIndex-i];
                array[maxIndex-i] = swap;
        }
    }
}
