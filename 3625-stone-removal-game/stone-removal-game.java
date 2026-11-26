class Solution {
    public boolean canAliceWin(int n) {
        int turn =10;
        int c=0;
        while(n>=turn){
            n-=turn;
            c++;
            turn-=1;
        }
        return c%2!=0;
    }
}