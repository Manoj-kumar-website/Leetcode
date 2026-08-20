class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFre=0;
        int maxWin=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFre=Math.max(maxFre,freq[s.charAt(right)-'A']);
            int window=right-left+1;
            if(window-maxFre > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            window=right-left+1;
            maxWin=Math.max(window,maxWin);
        }
        return maxWin;
    }
}