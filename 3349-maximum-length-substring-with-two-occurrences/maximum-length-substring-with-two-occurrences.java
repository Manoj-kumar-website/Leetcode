class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int ans=0;
        int i=0;
        char[] c=new char[26];
        for(int j=0;j<s.length();j++){
            char r=s.charAt(j);
            c[r-'a']++;
            while(c[r-'a']>2){
                char l=s.charAt(i);
                c[l-'a']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}