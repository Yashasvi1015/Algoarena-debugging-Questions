/*
The function/method factorial is intended to return the factorial of a given integer n using recursion.
The function compiles successfully but fails to return the correct result for some test cases 
because the recursive step is missing.

Your task is to fix the code so that it passes all the test cases.
*/

#include <iostream>
using namespace std;

unsigned long long factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        // missing code
    }
}

int main() {
    int n = 5;
    cout << factorial(n);
    return 0;
}
