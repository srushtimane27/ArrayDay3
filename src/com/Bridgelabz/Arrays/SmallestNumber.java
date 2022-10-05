package com.Bridgelabz.Arrays;

public class SmallestNumber {
    public static int findSmallestNumber(int[] array){
        int smallNumber =array[0];

        for (int i=0; i< array.length; i++){
            if (array[i] < smallNumber)
            {
                smallNumber = array[i];
            }
        }
        return smallNumber;
    }

    public static void main(String[] args) {
        int[] array = {10,58,93,3,49};
        findSmallestNumber(array);
        System.out.println("Smallest number is: "+findSmallestNumber(array));
    }
}
