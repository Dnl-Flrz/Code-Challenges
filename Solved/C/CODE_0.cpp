//
// Created by Dnl Florez on 18-Aug-22.
//

#include "iostream"
using namespace std;

int main(int argc, char *argv[]) {
    for(int i=1; i < 101; i++){
        if(i % 3 == 0 && i % 5 == 0)
            cout << "FizzBuzz" << endl;
        else if(i % 3 == 0)
            cout << "Fizz" << endl;
        else if(i % 5 == 0)
            cout << "Buzz" << endl;
        else
            cout << i << endl;
    }
    return 0;
}