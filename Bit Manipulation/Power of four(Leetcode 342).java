/*
Approach:Brute force;
Time complexity:O(logN);
Space complexity:O(1);
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        if(n==1) return true;

        while(n>1){
            if(n%4!=0) return false;
            n=n/4;
        }
        return true;

    }
}


/*
Approach:Brute force;
Time complexity:O(1);
Space complexity:O(1);
*/


class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return ((n&(n-1))==0) && isPerfectSquare(n);
    }
    public boolean isPerfectSquare(int n){
        int root=(int)Math.sqrt(n);
        return root*root==n;
    }
}


/*
Approach:Brute force;
Time complexity:O(1);
Space complexity:O(1);
*/


class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return ((n&(n-1))==0) && n%3==1;
    }
     
}
