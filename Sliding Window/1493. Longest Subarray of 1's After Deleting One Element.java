/*
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.



Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int l=0;
        int r=0;
        int count = 0;
        for(;r<nums.length; r++){
            if(nums[r] == 0){
                count++;
            }
            for(;count > 1; l++){
                if(nums[l] == 0){
                    count--;
                }
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans-1;
    }
}