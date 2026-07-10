class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        int low=0,right=str.length-1;
        while(low<right){
            String temp=str[low];
            str[low]=str[right];
            str[right]=temp;
            low++;
            right--;
        }
        String ans="";
        for(String sam:str){
            ans+=sam+" ";
        }
        return ans.trim();
    }
}