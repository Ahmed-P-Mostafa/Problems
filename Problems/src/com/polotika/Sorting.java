package com.polotika;

public class Sorting {
    static void insertionIncreasingSort(int[] arr){
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

    static void insertionDecreasingSort(int[] arr){
        // int[] array = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //   3,44,38,5,47,15,36,26,27,2,46,4,19,50,48

        int j,key;

        for (int i = 1; i< arr.length;i++){
            key = arr[i];
            j = i-1;
            while (j>=0&&arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for (int i:arr) {
            System.out.print(i+" ");

        }
    }

    static void selectionIncreasingSort(int[] arr){
        // t j
        // 3,44,38,5,47,15,36,26,27,2,46,4,19,50,48
        //   l
        // t = 1
        int l ,t , j ;
        for(int i =0 ; i<arr.length-1;i++){
            l = arr[i];
            t = i;
            for (j = i+1 ; j < arr.length-1;j++){
                if (arr[j]<l){
                    l = arr[j];
                    t = j;
                }
            }
            arr[i] = l;
            arr[j] = t;
        }
        for (int i :
                arr) {
            System.out.print(i+" ");
        }
    }
}
