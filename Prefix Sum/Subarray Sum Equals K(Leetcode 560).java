/*
Approach-1:brute force;
Time complexity:O(n^2);
Space complexity:O(1);
*/
class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
}
/*
Approach-1:HashMap and prefix sum;
Time complexity:O(n);
Space complexity:O(n);
*/
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

/*
Approach-3:HashMap and prefix sum;
Time complexity:O(n);
Space complexity:O(n);
*/

public class Solution {
    public int subarraySum(int[] arr, int k) {
         int n=arr.length;
         int count=0;
         for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
         }
         Map<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<n;i++){
            int ele=arr[i];
            if(ele==k) count++;
            int rem=ele-k;
            if(map.containsKey(rem)) count+=map.get(rem);
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
         }
         return count;
    }
}
