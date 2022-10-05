package com.Bridgelabz.Arrays;

public class SecondLargestNumber {
    public static int secondLargest(int[] array) {
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstNumber) {
                secondNumber = firstNumber;
                firstNumber = array[i];
            } else if (array[i] > secondNumber && array[i] != firstNumber) {
                secondNumber = array[i];
            }
        }
        return secondNumber;
    }
    public static void main(String[] args) {
        int[] array = {25, 78, 94, 60, 39};
        int secondNumber = secondLargest(array);
        if (secondNumber == 0){
            System.out.println("Not second largest number");
        }else {
            System.out.println("Number = " + secondNumber);
        }
    }
}
