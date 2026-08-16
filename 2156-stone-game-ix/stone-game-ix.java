class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] c=new int[3];
        for(int num:stones){
            c[num%3]++;
        }
        if(c[0]%2==0){
            return c[1]>=1 && c[2]>=1;
        }
        else{
            return Math.abs(c[1]-c[2])>2;
        }
    }
}