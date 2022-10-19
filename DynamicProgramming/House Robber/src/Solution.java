class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return Math.max(dp[dp.length-1], dp[dp.length - 2]);
    }

    public static void main(String[] args) {
        Solution inst = new Solution();
        int[] arr = {2, 1, 1, 2};
        inst.rob(arr);
    }
}