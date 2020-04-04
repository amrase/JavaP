package ReferenceValues;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int myIntValue = 10;
        int anotherValue = myIntValue;

        System.out.println("My Int Value " + myIntValue);
        System.out.println("Another Value "+ anotherValue);

        anotherValue++;

        System.out.println("My Int Value " + myIntValue);
        System.out.println("Another Value "+ anotherValue);

        int[] intArray = new int[5];
        int[] anotherIntArray = intArray;

        System.out.println("My Int array " + Arrays.toString(intArray));
        System.out.println("Another array " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] =1;


        System.out.println("After change");
        System.out.println("My Int array " + Arrays.toString(intArray));
        System.out.println("Another array " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{4,5,6,7,8};
        modifyArray(intArray);


        System.out.println("After Modify");
        System.out.println("My Int array " + Arrays.toString(intArray));
        System.out.println("Another array " + Arrays.toString(anotherIntArray));

    }


    private static void modifyArray(int[] array){
        array[0]=2;

//        array = new int[]{1,2,3,4,5};
    }

}
