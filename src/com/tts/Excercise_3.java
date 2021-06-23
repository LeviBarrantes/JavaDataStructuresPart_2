package com.tts;
import java.util.*;
public class Excercise_3 {

    public static void main(String[] args) {
         int size = 4;
         int power = 2;
        double [] powerResult = toPower(size, power);

        System.out.println(" The  size with each array index raised to the value of power: "+Arrays.toString(powerResult));
    }

    public static double[] toPower(int size, int power){

        double[] result = new double[size];
        for(int i=0; i<size; i++){
            result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));

        }
        return result;
    }

}
