/*
Approach-1:Max  Heap;
Time complexity:O(NLogK);
Space complexity:O(K); */

 class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int dist=Math.abs(arr[i]-x);
            pair helper=new pair(dist,arr[i]);
            pq.add(helper);
            if(pq.size()>k) pq.remove();
        }
        List<Integer> ans=new ArrayList<>();
        while(pq.size()>0){
            pair p=pq.remove();
            ans.add(p.val);
        }
        Collections.sort(ans);
        return ans;
    }
    class pair implements Comparable<pair>{
        int d;
        int val;
        pair(int d,int val){
            this.d=d;
            this.val=val;
        }
       public int compareTo(pair t){
          if(this.d==t.d) return this.val-t.val;
            return this.d-t.d;
        }
    }
    }
