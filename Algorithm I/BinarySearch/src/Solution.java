class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int midIndex = left + (right - left)/2;
            if(nums[midIndex] == target) return midIndex;
            else if(nums[midIndex] < target) left = midIndex + 1;
            else if(nums[midIndex] > target) right = midIndex - 1;
        }
        return -1;
    }
}