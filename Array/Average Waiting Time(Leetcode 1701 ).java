/*
Approach-1:iterative method
Time complexity:O(n);
Space complexity:O(1);
*/

class Solution {
    public double averageWaitingTime(int[][] arr) {
        int n=arr.length;
        double sum=arr[0][1];
        int p=arr[0][0]+arr[0][1];
        for(int i=1;i<n;i++){
            if(arr[i][0]<p){
                p+=arr[i][1];
                sum+=(p-arr[i][0]);
            }
            else{
                sum+=arr[i][1];
                p=arr[i][0]+arr[i][1];
            }
        }
        return sum/n;
    }
}
