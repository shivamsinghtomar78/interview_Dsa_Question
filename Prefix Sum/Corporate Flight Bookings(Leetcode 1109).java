/*
Approach-1:Prefix Sum;
Time complexity:O(n*m);
Space complexity:O(n);
*/
class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[]ans=new int[n];
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int last=arr[i][1];
            int seats=arr[i][2];
            for(int j=first-1;j<=last-1;j++){
                ans[j]+=seats;
            }
        }
        return ans;
    }
}

/*
Approach-1:Prefix Sum;
Time complexity:O(n+m);
Space complexity:O(n);
*/


class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int[]ans=new int[n];
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int last=arr[i][1];
            int seats=arr[i][2];
            ans[first-1]+=seats;
          if(last<n)  ans[last]-=seats;
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }
}
  

