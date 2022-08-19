#include "iostream";
#include "bits/stdc++.h"
using namespace std;

bool anagrama(string word1, string word2){
    if(word1 == word2) {
        return false;
    }else {
        char* w1 = &word1[0];
        char* w2 = &word2[0];
        sort(&w1[0], &w1[word1.length()]);
        sort(&w2[0], &w2[word2.length()]);
        return (*w1 == *w2);
    }
}

int main (int argc, char *argv[]){
    string p1 = "roma", p2 = "amor";
    cout << anagrama(p1, p2);
}