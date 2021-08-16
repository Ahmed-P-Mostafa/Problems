//
// Created by ahmed on 8/16/21.
//

#include "FinishedProblems.h"
#include <iostream>


void AntonAndDanik()
{
    int matches , a =0 ,d = 0;
    std::cin >> matches;
    std::string score;
    std::cin >>score;

    for (int i=0;i<score.length();i++){
        if (score[i]=='A') a++;
        else if (score[i]=='D') d++;
    }
    if (a>d) std::cout<< "Anton";
    else if (d>a) std::cout<<"Danik";
    else std::cout<< "Friendship";
}

