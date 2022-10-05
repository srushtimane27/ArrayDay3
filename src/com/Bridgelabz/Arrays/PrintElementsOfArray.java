package com.Bridgelabz.Arrays;

public class PrintElementsOfArray {
    public static void printArray(int[] marks){

        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    public static void main(String[] args) {
        int[] marks = new int [5];
        marks[0] = 50;
        marks[1] = 40;
        marks[2] = 10;
        marks[3] = 80;
        marks[4] = 56;

        printArray(marks);

    }
}
