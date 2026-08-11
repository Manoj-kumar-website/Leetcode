class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int tot=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                tot+=nums[i];
            }
            else{
                break;
            }
        }
        while(s.contains(tot)){
            tot++;
        }
        return tot;
    }
}