package com.polotika;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pick = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n number");
        int n = scanner.nextInt();
        int result = BinarySearch.guessNumber(n);
        System.out.println(result);

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

    /*
    start = 1
    i = 0
    * 0 1 2 3
    * 1 2 3 4
    *
    */
}
