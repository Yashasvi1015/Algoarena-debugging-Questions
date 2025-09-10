/*
The function/method isPalindrome is intended to check whether a given integer n 
is a palindrome (i.e., it reads the same forward and backward).  


Example:
Input: 121
Output: true

Input: -121
Output: false
*/

public class PalindromeCheck {
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
        }
        return temp == rev;
    }
    public static void main(String[] args) {
        int n = 24242;
        System.out.println(isPalindrome(n) ? "true" : "false");
    }
}
