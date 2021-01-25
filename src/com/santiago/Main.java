package com.santiago;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner userInput = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integers:\r");
        int[] userArray = new int[number];

        for (int i=0; i<userArray.length; i++){
            userArray[i] = userInput.nextInt();
        }
        return userArray;
    }



    public static void printArray(int[] array){
        System.out.println("The numbers are: " + Arrays.toString(array));
    }

    public static int[] sortedIntegers(int[] array) {

//        //////////// TIMS WAY////////////////
//        int[] sortedArray = new int[array.length];
//        for (int i=0; i< array.length; i++){
//            sortedArray[i] = array[i];
//        }
//        boolean flag = true;
//        int temp;
//        while(flag){
//            flag = false;
//            for(int i=0; i< sortedArray.length-1; i++){
//                if(sortedArray[i]<sortedArray[i+1]){
//                    temp=sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }



        // MY WAY:
        Arrays.sort(array);
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[array.length-1-i] = array[i];
        }
        return sortedArray;

    }


    public static void main(String[] args) {
	    int[] userArray = getIntegers(5);
	    printArray(userArray);
        System.out.println("Sorting in descending order....");
        printArray(sortedIntegers(userArray));
    }
}
