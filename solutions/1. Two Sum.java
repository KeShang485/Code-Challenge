//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//time Complexity:O(n*n);
//space Complexity:O(1);

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length() - 1;i++) {
            for (int j = i + 1;j <nums.length(); j++) {
                    if (nums[j] = target - nums[i]) {
                        return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
