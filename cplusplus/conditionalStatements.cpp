#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

/*
Problem Description: https://www.hackerrank.com/challenges/c-tutorial-conditional-if-else
*/
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int a;
    cin>>a;
    if(a>=1&&a<=9){
        if(a==1){
            cout<<"one";
        }
        else if(a==2){
            cout<<"two";
        }
        else if (a==3){
            cout<<"three";
        }
        else if (a==4){
            cout<<"four";
        }
        else if(a==5){
            cout<<"five";
        }
        else if(a==6){
            cout<<"six";
        }
        else if(a==7){
            cout<<"seven";
        }
        else if (a==8){
            cout<<"eight";
        }
        else if(a==9){
            cout<<"nine";
        }
    }
    else{
        cout<<"Greater than 9";
    }
   return 0;
}
