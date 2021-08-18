#include <iostream>
#include <algorithm>


int main() {

    int t ;
    std::cin >> t;

    for (int i = 1; i <=t; ++i) {
        int k;
        std::cin >> k;
        std::string  kk = std::to_string(k);
        char last = kk.at(kk.length()-1);
        if (k % 3 == 0|| last=='3'){
            t++;
        }else{
            std::cout << i <<std::endl;

        }

    }


    return 0;
}





