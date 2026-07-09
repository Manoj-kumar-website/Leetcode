class Solution {
    public int shipWithinDays(int[] weights, int days) {
      int left=Arrays.stream(weights).max().getAsInt();
      int right=Arrays.stream(weights).sum();
      while(left<right){
        int mid=(left+right)/2;
        int n=day(weights,mid);
        if(n<=days){
            right=mid;
        }
        else{
            left=mid+1;
        }
      }
      return left;
    }
    int day(int[] arr,int d){
        int day=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count+arr[i]>d){
                day++;
                count=arr[i];
            }
            else{
                count+=arr[i];
            }
        }
        return day;
    }
}