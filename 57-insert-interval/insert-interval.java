class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        List<List<Integer>> li=new ArrayList<>();
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            li.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        li.add(new ArrayList<>(Arrays.asList(newInterval[0],newInterval[1])));
        while(i<n){
            li.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
            i++;
        }
        int[][] arr=new int[li.size()][2];
        for(int j=0;j<li.size();j++){
            arr[j][0]=li.get(j).get(0);
            arr[j][1]=li.get(j).get(1);
        }
        return arr;

       
    }
}