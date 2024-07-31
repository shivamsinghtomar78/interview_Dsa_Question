/*
Approach-1:HashSet and using ArrayList;
Time complexity:O(N);
Space complexity:O(N); */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else map.put(arr[i],1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int key:map.keySet()){
            set.add(map.get(key));
        }
        if(map.size()!=set.size()) return false;
        else return true;
    }
}
