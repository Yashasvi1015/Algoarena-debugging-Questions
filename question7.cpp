/*
The function/method countDigits is intended to return the number of 
digits in a given positive integer n.  
Example:
Input: 12345
Output: 5
*/

#include <iostream>
using namespace std;

int countDigits(int n) {
    int count = 0;
    while (n > 0) {
       // write the code here
    }
    return count;
}

int main() {
    int n = 6745321;
    cout << countDigits(n) << endl;
    return 0;
}
