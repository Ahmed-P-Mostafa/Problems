package com.polotika;

public class Sorting {
    static void insertionSort(int[] arr){
        // int[] array = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int j ,key;

        for(int i = 1;i< arr.length;i++){
            j = i-1;
            key = arr[i];

            while (j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int i:arr ) {
            System.out.print(i+" ");
        }
    }
}
