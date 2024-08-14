/*
Approach-1:Recurrsion;
Time complexity:O(2^n);
Space complexity:O(n);
*/

class Solution {
     public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public int fib(int n) {
        return fibo(n);
        
    }
}
