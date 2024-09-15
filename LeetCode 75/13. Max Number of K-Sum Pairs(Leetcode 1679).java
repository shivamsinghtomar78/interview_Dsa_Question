/*
Approach: HashMap;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                count++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{
                
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}

/*
Approach: two pointer and sorting  ;
Time complexity:O(N*logN);
Space complexity:O(1); */

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1, minOperations = 0;
        
        while(low < high){
            if(nums[low] + nums[high] == k){
                low++;
                high--;
                minOperations++;
            } 
            else if(nums[low] + nums[high] > k) high--;
            else low++;
        }
        
        return minOperations;
    }
}
