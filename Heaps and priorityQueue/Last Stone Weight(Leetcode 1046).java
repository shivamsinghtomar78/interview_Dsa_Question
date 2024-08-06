/*
Approach-1:Max  Heap;
Time complexity:O(NLogN);
Space complexity:O(N); */


class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <stones.length ; i++) {
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int helper=pq.remove();
            if(helper>pq.peek()){
                int p=pq.remove();
                pq.add(helper-p);
            }
            else if(pq.peek()>helper){
                int p=pq.remove();
                pq.add(p-helper);
            }
            else pq.remove();
        }
        if(pq.size()==0) return 0;
        return pq.remove();
    }
}
