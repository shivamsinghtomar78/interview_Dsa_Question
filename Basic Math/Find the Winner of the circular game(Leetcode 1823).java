/*
Approach-1:Using Deque
Time complexity :O(n*k);
Space complexity:O(n); */

class Solution {
    public int findTheWinner(int n, int k) {
      Deque<Integer> dq=new LinkedList<>();
        for(int i=1;i<=n;i++){
            dq.addLast(i);
        }
        while(dq.size()!=1){
            for(int i=1;i<k;i++){
                int p=dq.removeFirst();
                dq.addLast(p);
            }
            dq.removeFirst();
        }
        return dq.remove();
    }
}
/*
Approach-2:Using ArrayList
Time complexity :O(n^2);
Space complexity:O(n); */
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int i=0;
        while(arr.size()>1){
            int idx=(i+k-1)%arr.size();
            arr.remove(idx);
            i=idx;
        }
        return arr.get(0);
    }
}

/*
Approach-2:Using Recursion
Time complexity :O(n);
Space complexity:O(n); */

class Solution {
    public int solve(int n,int k){
        if(n==1){
            return 0;
        }
        return (solve(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) {
        int ans=solve(n,k)+1;
        return ans;
        
    }
}

