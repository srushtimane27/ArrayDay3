package com.Bridgelabz.Arrays;

public class EvenPositionArray {

    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5,6};

        System.out.println("Even position elements:");

        for (int i = 1; i< array.length; i=i+2){

            System.out.println(array[i]);
        }


    }

}
