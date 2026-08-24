class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String str="";
        for(int i=1;i<s.length();i++){
            int left=i;
            int right=i;
            while(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                if(left == -1 || right ==s.length()){
                    break;
                }
            }
            String st=s.substring(left+1,right);
            if(st.length()>str.length()){
                str=st;
            }
            left=i-1;
            right=i;
            while(s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                if(left == -1 || right ==s.length()){
                    break;
                }
            }
            st=s.substring(left+1,right);
            if(st.length()>str.length()){
                str=st;
            }
        }
        return str;
    }
}