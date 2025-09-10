/*
The function/method isPalindrome is intended to check whether a given integer n 
is a palindrome (i.e., it reads the same forward and backward).  


Example:
Input: 121
Output: true

Input: -121
Output: false
*/

#include <iostream>
using namespace std;

bool isPalindrome(int n) {
    int rev = 0, temp = n;
    while (n > 0) {
        rev = rev * 10 + n % 10;
      
    }
    return temp == rev;
}

int main() {
    int n = 24242;
    cout << (isPalindrome(n) ? "true" : "false") << endl;
    return 0;
}
