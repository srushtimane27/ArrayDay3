package com.Bridgelabz.Arrays;

import java.util.Arrays;

public class FrequencyOfElement {
    public static void countFrequency(int arr[], int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i=0; i<n; i++){
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs = " + count );
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10,30,50,10,30};
        int n = arr.length;
        countFrequency(arr , n);
    }
}
