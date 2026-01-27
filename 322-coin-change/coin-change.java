class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        for(int i=1;i<dp.length;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int co:coins){
                if(i>=co && dp[i-co]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[i-co]+1);
                }
            }
        }
       return    dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}