/*
Approach-1:HashSet and using ArrayList;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public int countDistinctIntegers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int ele:nums){
            arr.add(ele);
        }
         
        for(int ele:nums){
            int reverse=0;
            while(ele!=0){
            int digit=ele%10;
            reverse=reverse*10+digit;
            ele=ele/10;
            }
            arr.add(reverse);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        return set.size();
    }
}

/*
Approach-2:HashSet ;
Time complexity:O(N);
Space complexity:O(N); */


class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
            int reverse=0;
            while(ele!=0){
                int digit=ele%10;
                reverse=reverse*10+digit;
                ele=ele/10;
            }
            set.add(reverse);
        }
        return set.size();
    }
}
