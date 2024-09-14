/*
Approach-1:min Heap;
Time complexity;O(nLogn);
Space complexity:O(n);
*/

 

class Solution {
    public int[] frequencySort(int[] nums) {
        
        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.freq == b.freq) {
                return b.ele - a.ele;   
            }
            return a.freq - b.freq;   
        });

    
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

       
        for (int ele : map.keySet()) {
            pair p = new pair(map.get(ele), ele);
            pq.add(p);
        }

        int i = 0;
       
        while (!pq.isEmpty()) {
            pair q = pq.remove();
            int n = q.freq;
            for (int j = 0; j < n; j++) {
                nums[i] = q.ele;
                i++;
            }
        }

        return nums;
    }

    
    class pair {
        int freq;
        int ele;

        public pair(int freq, int ele) {
            this.freq = freq;
            this.ele = ele;
        }
    }
}


/*
Approach-1:min Heap;
Time complexity;O(nLogn);
Space complexity:O(n);
*/


class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums) {
            if(map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }
        
        for(int ele : map.keySet()) {
            pair p = new pair(map.get(ele), ele);
            pq.add(p);
        }
        
        int i = 0;
        while(!pq.isEmpty()) {
            pair q = pq.remove();
            int n = q.freq;
            for(int j = 0; j < n; j++) {
                nums[i] = q.ele;
                i++;
            }
        }
        
        return nums;
    }
    
    class pair implements Comparable<pair> {
        int freq;
        int ele;
        
        public pair(int freq, int ele) {
            this.freq = freq;
            this.ele = ele;
        }
        
        public int compareTo(pair p) {
             if(this.freq==p.freq){
                return p.ele-this.ele;
             }
             return this.freq-p.freq;
        }
    }
}
