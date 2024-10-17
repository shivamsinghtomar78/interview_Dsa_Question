/*
Approach:HashMap ;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int freq=map.get(nums[i]);
                map.put(nums[i],1+freq);
            }
            else map.put(nums[i],1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}


/*
Approach:Sorting  ;
Time complexity:O(NlogN);
Space complexity:O(logN); */

class Solution {
    public int singleNumber(int[] nums) {
         Arrays.sort(nums);
         int i=0;
         while(i<nums.length-1){
            if(nums[i]!=nums[i+1]) return nums[i];
            i+=2;
         }
         return nums[nums.length-1];
    }
}


/*
Approach:Sorting  ;
Time complexity:O(N);
Space complexity:O(1); */


class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int ele:nums){
            ans^=ele;
        }
        return ans;
    }
}
