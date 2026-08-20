class Solution {
    public String minWindow(String s, String t) {
        int[] freqS=new int[256];
        int[] freqT=new int[256];
        for(char c:t.toCharArray()){
            freqT[c]++;
        }
        int left=0,minStart=0,minLen=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            freqS[s.charAt(right)]++;
            while(contains(freqS,freqT)){
                if(right-left+1 < minLen){
                minLen=right-left+1;
                minStart=left;
                }
                freqS[s.charAt(left)]--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart + minLen);
    }
    boolean contains(int[] freqS,int[] freqT){
        for(int i=0;i<256;i++){
            if(freqT[i]>freqS[i]){
                return false;
            }
        }
        return true;
    }
}