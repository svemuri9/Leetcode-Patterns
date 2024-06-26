/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.



Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int l = 0;
        int r = 0;
        int c = 0;
        int max = 0;

        while(r < n){
            if(nums[r] == 1){

            }
            else{
                c++;
                if(c <= k){

                }
                else{
                    while(c > k){
                        if(nums[l] == 0){
                            c--;
                        }
                        l++;
                    }
                }
            }
            max = Math.max(max , r-l+1);
            r++;
        }

        return max;
    }
}