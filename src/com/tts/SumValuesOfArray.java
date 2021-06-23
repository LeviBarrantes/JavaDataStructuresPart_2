package com.tts;

public class SumValuesOfArray {
    public static void main(String[] args) {
        //Initialize myArray
        int [] myArray = new int [] {10,20,30,40,50,60};
        int sum = 0;
        //Loop through myArray to calculate sum the values
        for (int i = 0; i <myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum of all the values of given array: " + sum);
    }
}