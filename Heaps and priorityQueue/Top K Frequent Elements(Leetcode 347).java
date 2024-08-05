/*
Approach-1:Min Heap;
Time complexity:O(NLogK);
Space complexity:O(K+N); */

class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        PriorityQueue<pair> pq=new PriorityQueue<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i])) {
                int f = map.get(arr[i]);
                map.put(arr[i], f + 1);
            } else map.put(arr[i], 1);
        }
        for(int key:map.keySet()){
            pair p=new pair(key,map.get(key));
            pq.add(p);
            if(pq.size()>k) pq.remove();
        }
        int[] ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            pair helper=pq.remove();
            ans[i]=helper.element;
           i++;
        }
        return ans;
    }
    class pair implements Comparable<pair>{
        int freq;
        int element;
        pair(int element,int freq){
            this.element=element;
            this.freq=freq;
        }
        public int compareTo(pair p){
            return this.freq-p.freq;
        }
    }
}
