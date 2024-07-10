/*
Approach-1:using Queue
Time Complexity: O(N)
Space Complexity: O(N)
Problem:https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
*/

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[]res=new long[N-K+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(A[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i<N-K+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();
            if( q.size()>0 && q.peek()<=i+K-1){
                res[i]=A[q.peek()];
            }
            else if(q.size()==0) res[i]=0;
            else res[i]=0;
        }
        return res;
    }
    
}
