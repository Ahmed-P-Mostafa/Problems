package com.polotika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    }

   int findTheNumber(int x){
        String k = Integer.toString(x);
        char kk = k.charAt(k.length()-1);
        if (x%3!=0|| kk!='3'){
            return x;
        }else {
            return x++;
        }
   }



}





