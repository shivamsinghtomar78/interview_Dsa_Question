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


    /*
Approach-2:ArrayList;
Time complexity:O(N^2logN);
Space complexity:O(N); */

 class Solution {
   public int lastStoneWeight(int[] stones) {
        List<Integer> arr=new ArrayList<>();
        for(int ele:stones){
            arr.add(ele);
        }
        while(arr.size()>1){
            Collections.sort(arr);
            int y=arr.remove(arr.size()-1);
            int x=arr.remove(arr.size()-1);
            if(y!=x) arr.add(y-x);
        }
        if(arr.size()==0) return 0;
        else return arr.get(0);
    }
}
