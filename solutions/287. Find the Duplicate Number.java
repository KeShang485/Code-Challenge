
//Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), 
//prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.


//method1 HashSet O(N) O(N)
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<Integer>();
        int i = 0;
        for(i = 0;i<nums.length - 1;i++){
            if(!hash.contains(nums[i])) {
                hash.add(nums[i]);
            }else {
                break;
            }
        }
        return nums[i];
    }
}

//method2 Time complexity : O(nlgn) Space complexity : O(1)O(1) (or O(n)O(n))
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }

        return -1;
