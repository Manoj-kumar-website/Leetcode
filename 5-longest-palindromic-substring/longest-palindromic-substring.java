class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <=1){
            return s;
        }
        String str="";
        int left=0,right=0;
        for(int i=1;i<s.length();i++){
            left=i;right=i;
            while(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                if(left==-1 || right==s.length()){
                    break;
                }
            }
            String pr=s.substring(left+1,right);
            if(pr.length()>str.length()){
                str=pr;
            }
            left=i-1;
            right=i;
            while(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                if(left==-1 || right==s.length()){
                    break;
                }
            }
            pr=s.substring(left+1,right);
            if(pr.length()>str.length()){
                str=pr;
            }
        }
        return str;
    }
}