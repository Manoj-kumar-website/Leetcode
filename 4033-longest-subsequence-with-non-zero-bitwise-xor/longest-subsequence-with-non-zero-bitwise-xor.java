class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int n=nums.length;
        int c=0;
        for(int num:nums){
            xor^=num;
            if(num==0){
                c++;
            }
        }
        if(xor>0){
            return n;
        }
        else{
            if(c==n){
                return 0;
            }
            else{
                return n-1;
            }
        }
    }
}