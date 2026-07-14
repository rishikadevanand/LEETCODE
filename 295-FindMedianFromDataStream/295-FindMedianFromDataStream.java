// Last updated: 7/14/2026, 2:45:24 PM
class MedianFinder {
    PriorityQueue<Integer>max;
    PriorityQueue<Integer>min;

    public MedianFinder() {
        max= new PriorityQueue<>(Collections.reverseOrder());
        min= new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(min.size()>max.size()) max.offer(min.poll());
    }
    
    public double findMedian() {
        if(max.size()>min.size()) return max.peek();
        return (max.peek()+min.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */