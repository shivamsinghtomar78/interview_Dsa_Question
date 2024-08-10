/*
Approach-1:Prefix Sum;
Time complexity:O(nlogn+n*m);
Space complexity:O(n + m);
*/


class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        int m=queries.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        int[]ans=new int[m];
        for(int i=0;i<m;i++){
            int len=0;
            for(int j=0;j<n;j++){
                if(queries[i]>=nums[j]){
                    len=j+1;
                }
            }
            ans[i]=len;
        }
        return ans;
    }
}
