class Solution {
    public void rotate(int[] nums, int k) {
        int numsSize = nums.length
        for (int i = 0; i < numsSize; i++) {
            int tmp = nums[(i+k)%numsSize];
            nums[(i+k)%numsSize] = nums[i];
            
        }
    }
}