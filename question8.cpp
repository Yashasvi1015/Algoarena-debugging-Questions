/*
The function/method reverseNumber is intended to reverse the digits of a given integer n.  
The code compiles but fails to produce the correct result because of incorrect loop logic.  

Your task is to fix the code so that it passes all the test cases.  

Example:
Input: 1234
Output: 4321
*/

#include <iostream>
using namespace std;

int reverseNumber(int n) {
    int rev = 0;
    while (n > 0) {
        rev = rev * 10 + n % 10, 
        
    }
    return rev;
}

int main() {
    int n = 5678;
    cout << reverseNumber(n) << endl;
    return 0;
}
