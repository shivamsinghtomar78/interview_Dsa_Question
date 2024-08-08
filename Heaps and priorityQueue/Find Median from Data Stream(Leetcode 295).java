/*
Approach-1:MaxHeap and minHeap;
Time complexity:O(LogN) For Addnum,O(1) For Find median
Space complexity:O(N); */



class MedianFinder {
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else{
            if(num<maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
            
        } 
        //balance the heaps
        if(maxHeap.size()==minHeap.size()+2){
            int top=maxHeap.remove();
            minHeap.add(top);        
            }
            if(minHeap.size()==maxHeap.size()+2){
            int top=minHeap.remove();
            maxHeap.add(top);        
            }
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
        else if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        else return minHeap.peek();
    }
}
