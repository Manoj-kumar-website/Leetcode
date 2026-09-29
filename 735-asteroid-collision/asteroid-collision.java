class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<Math.abs(asteroids[i]) && st.peek()>0){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            }
        }
        int[] arr=new int[st.size()];
        int k=0;
        for(int i:st){
            arr[k++]=i;
        }
        return arr;
    }
}