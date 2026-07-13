class Solution {
    public int beautySum(String s) {
        int n=s.length(),res=0;
        for(int i=0;i<n;i++){
            int[] arr=new int[26];
            for(int j=i;j<n;j++){
                arr[s.charAt(j)-'a']++;
                res+=compute(arr);
            }
        }
        return res;
    }
    public int compute(int[] arr){
        int mini=Integer.MAX_VALUE, maxi=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>0){
            mini=Math.min(i,mini);
            maxi=Math.max(i,maxi);
            }
        }
        return maxi-mini;
    }
}