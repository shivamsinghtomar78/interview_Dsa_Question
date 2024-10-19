/*
Aprroach:Brute force ;
Time complexity:O(logN);
Space complexity:O(1);
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false ;
        if(n==1) return true ;
        while(n>1){
            if(n%2!=0) return false;
            n=n/2;
        }
        return true;
    }
}


/*
Aprroach:Bit Manipulation ;
Time complexity:O(1);
Space complexity:O(1);
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n<=0) return false;
         return ((n&(n-1))==0);
    }
}
