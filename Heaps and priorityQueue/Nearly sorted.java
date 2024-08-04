/*
Approach-1:min Heap;
Time complexity;O(nLogk);
Space complexity:O(n); 
Problem:https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1 
*/

class Solution
{
     ArrayList<Integer> nearlySorted(int arr[], int num, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> ans=new ArrayList<>();
         for(int ele:arr){
             pq.add(ele);
             if(pq.size()>k){
                 int p=pq.remove();
                 ans.add(p);
             }
         }
         while(pq.size()>0){
             int p=pq.remove();
             ans.add(p);
         }
      return ans;
    } 
}
