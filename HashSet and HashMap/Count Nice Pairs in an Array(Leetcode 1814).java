/*
Approach-1:HashMap
Time complexity:O(N);
Space complexity:O(N); */


class Solution {
    public int countNicePairs(int[] nums) {
        int count =0;
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int ele=nums[i]-rev(nums[i]);
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                count+=freq;
                count%=1000000007;
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        return count;
    }
    public int rev(int n){
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
}
