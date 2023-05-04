/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extracredit2;

/**
 *
 * @author Justin
 */
public class ArrayRatio {

    public static double getRatio(int[] array) {
        
        //Find the 2 largest number
        //Initalize variables for getRatio and getLargest
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest1) {
                largest2 = largest1;
                largest1 = array[i];
            } else if (array[i] > largest2) {
                largest2 = array[i];
            }
        }

        //Find the 2 smallest numbers
        //Initalize variables for getRatio and getSmallest
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest1) {
                smallest2 = smallest1;
                smallest1 = array[i];
            } else if (array[i] < smallest2) {
                smallest2 = array[i];
            }
        }

        //Return ratio value
        return (double) (largest1 + largest2) / (smallest1 + smallest2);

    }

    public static int getLargest1(int[] array) {

        //Find the largest number to push to main
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int getLargest2(int[] array) {

        //Find the 2nd largest number to push to main
        int largest = getLargest1(array);
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int getSmallest1(int[] array) {
        //Find the smallest number to push to main
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int getSmallest2(int[] array) {
        //Find the 2nd smallest number to push to main
        int smallest = getSmallest1(array);
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= secondSmallest && array[i] >= smallest) {
                secondSmallest = array[i];
            }
        }
        return secondSmallest;
    }

}
