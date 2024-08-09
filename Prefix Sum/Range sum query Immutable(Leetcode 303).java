/*
Approach-1:Prefix Sum;
Time complexity:sumRange:O(n),constructor:O(1);
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

/*
Approach-2:Prefix Sum;
Time complexity:sumRange:O(1),constructor:O(n);
Space complexity:O(n);
*/

class NumArray {
    int [] arr;
    public NumArray(int[] nums) {
        arr=Arrays.copyOf(nums,nums.length);
        for(int i=1;i<nums.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return arr[right];
        return arr[right]-arr[left-1];
    }
}

