package Fundamentals.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    //Write a Java program to find maximum product of two integers in a given array of integers.
    public void maxProduct() {
        double[] myArray = {2, 3, 5, 7, -7, 5, 8, -5};
        double max = Integer.MIN_VALUE;
        double secondMax = max;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                secondMax = max;
                max = myArray[i];
            } else if (myArray[i] > secondMax) {
                secondMax = myArray[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("SecondMax is " + secondMax);
        System.out.println("Maximum product is " + max * secondMax);
    }

    //Write a Java program to test if an array of strings contains a specific value.
    public void specificValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value");
        int[] myArray = {1, 2, 7, 3, 10, 2, 9};
        int val = scanner.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == val) {
                System.out.println("The value is in array ");
            } else {
                System.out.println("The value isn't in array ");
            }
        }
    }

    //Write a Java program to find the duplicate values of an array of string values.
    public void duplicateNr() {
        int[] myArray = {1, 7, 3, 10, 1, 3, 1, 7, 3};
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int k = i + 1; k < myArray.length; k++) {
                if (myArray[i] == myArray[k]) {
                    System.out.println("Duplicate values are  " + myArray[k]);
                }
            }
        }
      //  Write a Java program to remove a specific element from an array.


    }

    //Write a Java program to find the max number (harder: the second max number) in an array of integers.
    public void secondMaxNr() {
        int[] myArray = {1, 7, 3, 10, 9};
        int max = Integer.MIN_VALUE;
        int secondMaxNr = max;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                secondMaxNr = max;
                max = myArray[i];

            } else if (myArray[i] > secondMaxNr) {
                secondMaxNr = myArray[i];
            }
        }
        System.out.println("Second max nr is " + secondMaxNr);
    }
    public static void removeElement() {
        int[] myArray1 = {2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println("Original array : " + Arrays.toString(myArray1));

        int removeIndex = 3;
        for (int i = removeIndex; i < myArray1.length - 1; i++) {
            myArray1[i] = myArray1[i + 1];
        }
        System.out.println("Array after removed element : " + Arrays.toString(myArray1));

    }
}

