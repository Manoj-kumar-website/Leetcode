class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int max=0;
         int[] arr=new int[256];
         Arrays.fill(arr,-1);
         while(right<s.length()){
            if(arr[s.charAt(right)] >= left){
                left=Math.max(arr[s.charAt(right)]+1,left);
            }
            int len=right - left +1;
            max=Math.max(len,max);
            arr[s.charAt(right)]=right;
            right++;
         }
         return max;
    }
}