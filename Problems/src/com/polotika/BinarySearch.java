package com.polotika;

public class BinarySearch {

    static int binarySearch(int arr[], int n, int k){
        // code here
        int l = 0;
        int r = n-1;
        int mid ;

        while(l!=r){
            mid = (l+r) /2;
            if(k>arr[mid]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        if(k == arr[r]){
            return r;
        }else{
            return -1;
        }

       /*
       monotonic method
       * i = 0 1 2 3 4
       * r = 1 2 3 4 5
       * m = 0 0 0 1 1
       * */

    }
}
