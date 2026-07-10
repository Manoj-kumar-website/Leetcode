class Solution {
    public String largestOddNumber(String num) {
        String str="";
        for(int i=num.length()-1;i>=0;i--){
            int c=num.charAt(i);
            if(c%2!=0){
                str=num.substring(0,i+1);
                break;
            }
        }
        return str;
    }
}