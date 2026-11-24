class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int pro=1;
            int g=0;
            int l=1;
            for(int j=i;j<n;j++){
                pro*=nums[j];
                g=gcd(g,nums[j]);
                l=l/gcd(l,nums[j])*nums[j];
                if(pro == g*l){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}