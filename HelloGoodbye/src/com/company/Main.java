package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name");
        String firstName = scanner.next();
        System.out.println("Please enter second name");
        String secondName = scanner.next();

        System.out.println("Hello "+firstName+" and "+secondName);
        System.out.println("Goodbye "+secondName+" and "+firstName);



    }
}
