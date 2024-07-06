/*
Approach-1:Brute force 
Time complexity:O(1);
Space complexity:O(1);  */

class Solution {
    public int passThePillow(int n, int time) {
        int ans=1;
        if(time==n){
            for(int i=1;i<time-1;i++){
                ans++;
            }
        }
        if(time<n){
            for(int i=1;i<=time;i++){
                ans++;
            }
        }
        if(time>n){
            int p=time/ (n-1);
            if(p%2==0){
                for(int i=1;i<=time%(n-1);i++){
                ans++;
            } 
            }
            else{
                ans=n;
                for(int i=1;i<=time%(n-1);i++){
                    ans--;
                }
            }
        }
        return ans;
    }
}


/*
Approach-2:optimal method 
Time complexity:O(1);
Space complexity:O(1);  */

class Solution {
    public int passThePillow(int n, int time) {
        int completcycle = 2 * (n - 1);
        int timeLeft = time % completcycle;
        
        if (timeLeft < n) {
            return timeLeft + 1;
        } else {
            return 2 * n - timeLeft - 1;
        }
    }
}



