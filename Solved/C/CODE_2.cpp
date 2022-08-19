#include "iostream"
using namespace std;

int main(int argc, char *argv[]){
    unsigned long pas = 0, act = 1, x;
    for (int i = 0; i < 50; ++i) {
        cout << pas << "," << "\t";
        x = pas + act;
        pas = act;
        act = x;
    }
}