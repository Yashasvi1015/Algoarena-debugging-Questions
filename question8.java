/*
The function/method reverseNumber is intended to reverse the digits of a given integer n.  
The code compiles but fails to produce the correct result because of incorrect loop logic.  

Your task is to fix the code so that it passes all the test cases.  

Example:
Input: 1234
Output: 4321
*/

public class ReverseNumber {
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10, 
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 5678;
        System.out.println(reverseNumber(n));
    }
}
