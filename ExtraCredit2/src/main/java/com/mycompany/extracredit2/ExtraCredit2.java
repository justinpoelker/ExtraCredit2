/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.extracredit2;

/**
 *
 * @author Justin
 */
public class ExtraCredit2 {

    public static void main(String[] args) {

        //Create example array
        int[] array = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};

        //New array with provided numbers
        double ratio = ArrayRatio.getRatio(array);

        //Pull number variables from ArrayRatio
        int largest1 = ArrayRatio.getLargest1(array);
        int largest2 = ArrayRatio.getLargest2(array);
        int smallest1 = ArrayRatio.getSmallest1(array);
        int smallest2 = ArrayRatio.getSmallest2(array);

        //Output
        System.out.println("The ratio is (" + largest1 + "+" + largest2 + ")/(" + smallest1 + "+" + smallest2 + ") = " + ratio);
    }
}
