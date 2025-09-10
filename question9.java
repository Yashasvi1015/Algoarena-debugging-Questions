/*
The function/method printPattern is intended to print a right-angled triangle 
pattern of '*' of size n.  

The code compiles but fails to print the correct pattern because of incorrect 
loop logic.  

Your task is to fix the code so that it passes all the test cases.

Example:
Input: n = 5
Output:
*
**
***
****
*****
*/

public class PatternPrinter {
   	 static void printPattern(int n) {
        	for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {   
                System.out.println("*");
           	 }
           	 System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
  }
}
