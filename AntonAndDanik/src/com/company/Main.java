package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0,d =0;

        int score = scanner.nextInt();
        String scores = scanner.next();
        for (int i =0;i<scores.length();i++) {
            if(scores.charAt(i)=='A'){
                a++;
            }else if (scores.charAt(i)=='D'){
                d++;
            }
        }
        if (a>d){
            System.out.println("Anton");
        }else if (d>a){
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }

    }
}
