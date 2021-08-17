//
// Created by ahmed on 8/16/21.
//

#include "FinishedProblems.h"
#include <iostream>

void matrix(){

    /** 4
    * my submission link
    * https://codeforces.com/contest/263/submission/126142809*/

    int moves = 0,a =0, i=0 ,j =0;

    int matrix[5][5];
    for (i;i < 5; i++) {
        j = 0;
        for (j; j < 5; ++j) {
            std::cin >> a;
            matrix[i][j]  = a;
            if (a==1){
                break;
            }
        }

        if (matrix[i][j] == 1) break;
    }
    if (i>=3) moves += (i+1)-3;
    else if (i<=3) moves += 3-(i+1);

    if (j>=3) moves += (j+1)-3;
    else if (j<=3) moves += 3-(j+1);

    std::cout << moves;
}

void team(){
    /** 3
* submission link
    https://codeforces.com/contest/231/submission/126105883
     * */

    int a,b,c,n , result = 0;

    std::cin >> n ;
    for (int i = 0; i < n; ++i) {
        std::cin >>a;
        std::cin >>b;
        std::cin >>c;
        if (a+b+c >=2){
            ++result;;
        }
    }
    std::cout <<result << std::endl;

}

void bearAndBigBrother(){
    /** 2
 * submission link
 * https://codeforces.com/contest/791/submission/126103928*/

    int a ,b ,i =0;
    std::cin>> a ;
    std::cin >>b;
    while (a<=b){
        a = a*3;
        b = b*2;
        i++;
    }
    std::cout<< i <<std::endl;

}

void AntonAndDanik(){

    /** 1
     * my submission link
     * https://codeforces.com/contest/734/submission/126102741*/

    int matches , a =0 ,d = 0;
    std::cin >> matches;
    std::string score;
    std::cin >>score;

    for (char i : score){
        if (i=='A') a++;
        else if (i=='D') d++;
    }
    if (a>d) std::cout<< "Anton";
    else if (d>a) std::cout<<"Danik";
    else std::cout<< "Friendship";
}




