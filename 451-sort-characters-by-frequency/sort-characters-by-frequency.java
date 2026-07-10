class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> q=new PriorityQueue<>((a,b)->(m.get(b)-m.get(a)));
        for(char key:m.keySet()){
            q.add(key);
        }
        StringBuilder sb=new StringBuilder();
        while(q.size()>0){
            char c=q.poll();
            for(int i=0;i<m.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}