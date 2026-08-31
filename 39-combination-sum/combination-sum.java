class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        combinationSum(0,candidates,target,li,new ArrayList<>());
        return li;
    }
    void combinationSum(int idx,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx] <= target){
            ds.add(arr[idx]);
            combinationSum(idx,arr,target - arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        combinationSum(idx + 1,arr,target,ans,ds);
    }
}