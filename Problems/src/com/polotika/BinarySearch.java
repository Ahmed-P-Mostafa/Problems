package com.polotika;

public class BinarySearch {
    private static int pick = 12;


    static int binarySearch(int arr[], int n, int k){

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

        return arr[r] == k? r:-1;

       /*
       monotonic method
       * i = 0 1 2 3 4
       * r = 1 2 3 4 5
       * m = 0 0 0 1 1
       * */

    }
    public static int guessNumber(int n) {
        int result = -2;
        //int mid = n/2;
        while (result!=0){
            result = guess(n);
            if (result==-1){
                n = n/2;
            }else if (result==1){
                n = (int) (n* 1.5);
            }
        }
        return n;
    }

    private static int guess(int n){
        return Integer.compare(n,pick);
    }
}
