package com.polotika;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    private static int pick = 6;


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
        int l = 1, r= n+1, g= (l+r)/2;
        while(l!=r){
            if (guess(g)==-1){

                g = (int) (g*1.5) ;
            }else if (guess(g)==1){
                g= g/2;
            }
            else l = r;
        }
        return g;
    }

    /*
    l       g         r
    0 1 2 3 4 5 6 7 8 9
    1 2 3 4 5 6 7 8 9 10
    0 0 0 0 0 1 1 1 1 1
            L R*/

    private static int guess(int n){
       if (n>pick)return 1;
       else if (n<pick) return -1;
       else return 0;
    }
    public static boolean test(List<String> list) {
        Boolean result = false;
        String word = list.get(0); //ball
        for (int i = 0; i < list.size(); i++) {
            String row = list.get(i);
            for (int j = 0; j < row.length(); j++) {

                if (word.charAt(i) == row.charAt(i)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }


        }
        return result;
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0;i< arr.length&& arrayList.size() == k;i++){
            if (arr[i]==start){

            }else {
                arrayList.add(start);
                //if (i==0)
                --i;
            }
            ++start;
        }

        return arrayList.get(k-1);
    }
}
