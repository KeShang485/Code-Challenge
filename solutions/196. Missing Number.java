public class Solution {
    /**
     * @param nums: An array of integers
     * @return: An integer
     */
    public int findMissing(int[] nums) {
        // write your code here
         Arrays.sort(nums);
         int i = 0;
        for (i = 0; i < nums.length;i++){
            if (i != nums[i]) {
                break;
            }
        }
        return i;
    }
}
