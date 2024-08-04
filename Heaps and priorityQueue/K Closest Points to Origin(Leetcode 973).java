/*
Approach-1:Max  Heap;
Time complexity:O(NLogk);
Space complexity:O(k); */

class Solution {
     public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i <points.length ; i++) {
            int x=points[i][0];
            int y=points[i][1];
            int d=x*x+y*y;
            pq.add(new triplet(d,x,y));
             if(pq.size()>k) pq.remove();

        }
        int[][] ans=new int[k][2];
        for (int i = 0; i <k ; i++) {
             triplet t=pq.remove();
            ans[i][0]=t.x;
            ans[i][1]=t.y;
        }

        return ans;

    }
    public class triplet implements Comparable<triplet>{
        int d;
        int x;
        int y;
        triplet(int d,int x,int y){
            this.d=d;
            this.x=x;
            this.y=y;
        }
        public int compareTo(triplet t){
            return this.d-t.d;
        }
    }
}
