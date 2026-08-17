class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[2];
        //Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int more=target-a;
            if(m.containsKey(more)){
                arr[0]=m.get(more);
                arr[1]=i;
                return arr;
            }
            m.put(nums[i],i);
        }
        return arr;
    }
}