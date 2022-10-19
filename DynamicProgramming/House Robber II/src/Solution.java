class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        int[] dp1 = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        dp1[0] = 0;
        dp1[1] = nums[1];
        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
            dp1[i] = Math.max(dp1[i-1], nums[i] + dp1[i-2]);
        }
        return Math.max(dp[dp.length-2], dp1[dp.length - 1]);
    }
}