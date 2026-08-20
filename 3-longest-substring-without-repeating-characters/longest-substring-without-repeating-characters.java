class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int max=0;
        Set<Character> li=new HashSet<>();
        while(end < s.length()){
            char c=s.charAt(end);
            while(li.contains(c)){
                li.remove(s.charAt(start));
                start++;
            }
            li.add(c);
            int len= end-start+1;
            max=Math.max(len,max);
            end++;
        }
         return max;
    }
}