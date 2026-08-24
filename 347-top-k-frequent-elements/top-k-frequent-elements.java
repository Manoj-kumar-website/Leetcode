class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] li=new List[nums.length+1];
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(int i:mp.keySet()){
            int freq=mp.get(i);
            if(li[freq] ==null){
                li[freq]=new ArrayList<>();
            }
            li[freq].add(i);
        }
        int[] res=new int[k];
        int index=0;
        for(int pos=li.length-1;index<k && pos>=0;pos--){
            if(li[pos] != null){
                for(Integer i: li[pos]){
                     res[index++]= i;
                }
               
            }
        }
        return res;
    }
}