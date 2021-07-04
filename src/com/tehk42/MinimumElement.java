package com.tehk42;

import java.util.Scanner;

public class MinimumElement {
    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Enter " + count +" integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Minimum number is " + findMin(array));
        return array;
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) min = array[i];
        }
        return min;
    }
//    public static int findMax(int[] array) {
//        int max = array[0];
//        for(int i = 1; i < array.length; i++) {
//            if(array[i] > max) max = array[i];
//        }
//        return max;
//    }
}
