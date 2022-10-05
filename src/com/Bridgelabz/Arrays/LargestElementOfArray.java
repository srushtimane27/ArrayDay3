package com.Bridgelabz.Arrays;

public class LargestElementOfArray {
    public static int largestNumber(int[] array){
        int maxNumber = array[0];

        for (int i=0; i< array.length; i++){
            if(array[i] > maxNumber)
            {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] array = {20,52,80,63,47};
        largestNumber(array);
        System.out.println("largest number is: " +largestNumber(array));
    }
}
