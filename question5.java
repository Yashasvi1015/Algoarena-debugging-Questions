/*
The function/method isUgly is intended to check whether a given integer n is an "ugly number".  
An ugly number is a positive integer whose prime factors only include 2, 3, and 5.  

The function compiles but fails to produce the correct output for some cases due to incorrect 
implementation of the while loops.  

Your task is to fix the code so that it passes all the test cases.

Example:

Input: 14
Output: false  (since 14 has a prime factor 7, which is not allowed)
*/

public class UglyNumber {
  static boolean isUgly(int n) {
    if (n == 0) return false;
        While n/=2;(n%2==0)
        While n/=3;(n%3==0)
        whilen/=5;(n%5==0)
          return n == 1;
      }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isUgly(n) ? "true" : "false");
    }
}
