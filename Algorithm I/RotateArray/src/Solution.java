class Solution {
    public void rotate(int[] nums, int k) {
        int numSize = nums.length;
        k %= numSize;
        reverse(nums, 0, numSize - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, numSize - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while(left <= right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}