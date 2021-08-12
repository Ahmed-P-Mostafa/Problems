package com.polotika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,h,x;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        h = scanner.nextInt();

        for (int i=0;i<n ;i++){
            x = scanner.nextInt();
            if (x>h)
                result++;
            result++;

        }
        System.out.println(result);


    }

    void test1(){
        int n,h,x;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        String[] numbers = scanner.nextLine().split(" ");
        n = Integer.parseInt(line[0]);
        h = Integer.parseInt(line[1]);

        for (int i=0;i<n ;i++){
            x = scanner.nextInt();
            if (x>h)
                result++;
            result++;

        }
        System.out.println(result);
    }
    void test2(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

        }
    }



}





