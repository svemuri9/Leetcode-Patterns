/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

 */

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans[] = new int[n];
        int x = n - 1;

        while (s <= e) {
            if (Math.abs(nums[s]) > Math.abs(nums[e])) {
                ans[x] = Math.abs(nums[s] * nums[s]);
                x--;
                s++;
            } else {
                ans[x] = Math.abs(nums[e] * nums[e]);
                x--;
                e--;
            }
        }
        return ans;


    }
}