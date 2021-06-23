/*
Fixed given errors removed s from examplesArray and removed one > from the loop
the output is 2
*/
package com.tts;

public class Exercises_2 {
    public static void main(String[] args) {

        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }

        }

        System.out.println(index);
    }
}