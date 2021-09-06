package com.polotika;

public class Sorting {
    // int[] array = new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

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
        System.out.println();
    }

    static void insertionDecreasingSort(int[] arr){
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
            System.out.print(i +" ");

        }
        System.out.println();
    }

    static void selectionIncreasingSort(int[] arr){
        int l ,t , j ;
        for(int i =0 ; i<arr.length-1;i++){
            l = arr[i];
            t = i;
            for (j = i+1 ; j < arr.length;j++){
                if (arr[j]<l){
                    l = arr[j];
                    t = j;
                }
            }
            arr[t] = arr[i];
            arr[i] = l;
        }
        for (int i :
                arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void selectionDecreasingSort(int[] arr){
        int h , j , t;

        for (int i = 0; i <arr.length;i++){
            h= arr[i];
            t = i;
            for (j = i+1;j< arr.length;j++){
                if (arr[j]>h){
                    h = arr[j];
                    t = j;
                }
            }

            arr[t] = arr[i];
            arr[i] = h;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
