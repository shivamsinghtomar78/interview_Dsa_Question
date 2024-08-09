/*
Approach-1:Prefix Sum;
Time complexity:O(n);
Space complexity:O(n);
*/

class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
