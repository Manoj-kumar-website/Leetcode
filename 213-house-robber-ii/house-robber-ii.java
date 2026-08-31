class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }
        int[] lastSkip = new int[nums.length-1];
        int[] firstSkip = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            lastSkip[i]=nums[i];
            firstSkip[i]=nums[i+1];
        }
        int last = houseRob(lastSkip);
        int first = houseRob(firstSkip);

        return Math.max(last,first);
    }
    int houseRob(int[] arr){
        if(arr.length < 2){
            return arr[0];
        }
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            dp[i]=Math.max(dp[i-1],(dp[i-2]+arr[i]));
        }
        return dp[dp.length-1];
    }
}