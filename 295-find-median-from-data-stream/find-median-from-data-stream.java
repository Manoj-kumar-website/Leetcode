class MedianFinder {
    PriorityQueue<Integer> p1;
    PriorityQueue<Integer> p2;
    public MedianFinder() {
     p1 = new PriorityQueue<>(Collections.reverseOrder());
     p2 = new PriorityQueue<>();  
    }
    
    public void addNum(int num) {
        p1.offer(num);
        p2.offer(p1.poll());
        if(p2.size() > p1.size()){
            p1.offer(p2.poll());
        }
    }
    
    public double findMedian() {
        if(p1.size() == p2.size()){
            return (p1.peek() + p2.peek())/2.0;
        }
        return (p1.peek ());
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */