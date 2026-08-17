class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int pre=1,pos=1;
       int[] res=new int[n] ;
       Arrays.fill(res,1);
       for(int i=0;i<n;i++){
        res[i] *=pre;
        pre *=nums[i];
       }
       for(int j=n-1;j>=0;j--){
        res[j] *=pos;
        pos *=nums[j];
       }
       return res;
    }
}