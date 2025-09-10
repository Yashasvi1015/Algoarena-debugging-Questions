/*
    DEBUGGING QUESTION:

    You are given a function `merge` that accepts four arguments:
    - nums1, a vector of integers (size m+n) where the first m elements are valid,
      and the remaining n elements are placeholders (0’s).
    - m, an integer representing the number of valid elements in nums1.
    - nums2, a vector of integers with n valid elements.
    - n, an integer representing the number of elements in nums2.

    The function is supposed to merge nums2 into nums1 as one sorted array.
    Example:
    Input:
        nums1 = [1,2,3,0,0,0], m = 3
        nums2 = [2,5,6], n = 3
    Output:
        nums1 = [1,2,2,3,5,6]

  
*/

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int j = 0;
    for(int i = m; i < (); i++) { 
        // Write your code here
    }
    sort(nums1.begin(), nums1.end()); 
}

int main() {
    vector<int> nums1 = {1,2,3,0,0,0};
    vector<int> nums2 = {2,5,6};
    int m = 3, n = 3;

    merge(nums1, m, nums2, n);

    for(int x : nums1) cout << x << " ";
    cout << endl; 
    return 0;
}
