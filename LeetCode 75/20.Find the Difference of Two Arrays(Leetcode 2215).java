/*
Approach: HashSet(Brute force) ;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i<nums1.length){
            if(set1.contains(nums1[i]) && !set2.contains(nums1[i])) {
                a.add(nums1[i]);
                set1.remove(nums1[i]);
            }
            
            i++;
        }

         i=0;
        while(i<nums2.length){
            if(set2.contains(nums2[i]) && !set1.contains(nums2[i])){
                 b.add(nums2[i]);
                  set2.remove(nums2[i]);

                 }
            i++;
        }
        ans.add(a);
        ans.add(b);
        return ans;

    }
}
