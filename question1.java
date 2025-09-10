/*
    DEBUGGING QUESTION:

    You are given a function `secondLargest` that accepts two arguments:
    - size, an integer representing the size of the array
    - arr, a list of integers

    The function is supposed to return the second largest element in the array.

    The code compiles but fails on certain test cases due to logical errors.
    Debug it so that it passes all test cases.

    Example:
    Input:  arr = [10, 20, 4, 45, 99], size = 5
    Output: 45

    Input:  arr = [3, 3, 3], size = 3
    Output: -1   (if there is no distinct second largest element)
*/

public class SecondLargest {
    static int secondLargest(int size, int[] arr) {
      int largest = arr[0], second = arr[0];
        	for (int i = 1; i <= size; i++) {
          	  If (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            	} else if (arr[i] > second) {
                second = arr[i];
            }
        }
        if (second == largest)
            return -1;
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int size = 5;
        System.out.println(secondLargest(size, arr));
    }
}
