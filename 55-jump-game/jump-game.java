class Solution {
    public boolean canJump(int[] nums) {
        int ans=nums.length-1;
        for(int idx=nums.length-2;idx>=0;idx--){
            if(idx + nums[idx]>=ans){
                ans=idx;
            }
        }
        return ans==0;
    }
}